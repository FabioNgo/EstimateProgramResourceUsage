package core;

import java.io.FileInputStream;

import core.checker.*;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

public class JCCHandler {
	final public static int CHECK_TYPE_COMMENT = 2;
	final public static int CHECK_TYPE_INDENT = 1;
	final public static int CHECK_TYPE_NAMING = 3;

	public Vector<Warning> warnings;

	final static int EXIT = 0;

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Vector<Warning> warnings = null;

		int type = 1;
		while (type != EXIT) {
			System.out.println();
			System.out.println();
			System.out.println("\t " + JCCHandler.CHECK_TYPE_NAMING
					+ ". Check naming convention.");
			System.out.println("\t " + JCCHandler.CHECK_TYPE_COMMENT
					+ ". Check comment convention.");
			System.out.println("\t " + JCCHandler.CHECK_TYPE_INDENT
					+ ". Check indent convention.");
			System.out.println("\t 0. Exit.");
			System.out.print("\tWhat do you want?");
			type = in.nextInt();

			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream(
						"C:/Users/wind/workspace/std/Java Convention Plugin/src/core/CommentChecker.java");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JCCHandler jccHandler = new JCCHandler(inputStream);
			warnings = jccHandler.check(inputStream, type);
			for (int i = 0; i < warnings.size(); i++) {
				System.out.println(warnings.elementAt(i).toString());
			}
		}
	}

	private IChecker checker;
	private CommentChecker commentChecker;
	private IndentChecker indentChecker;

	private NamingChecker namingChecker;

	public JCCHandler(InputStream stream) {
		namingChecker = new NamingChecker(stream);
		commentChecker = new CommentChecker(stream);
		indentChecker = new IndentChecker(stream);
	}

	public Vector<Warning> check(InputStream is, int type) {
		switch (type) {
		case CHECK_TYPE_COMMENT:
			checker = commentChecker;
			break;
		case CHECK_TYPE_INDENT:
			checker = indentChecker;
			break;
		case CHECK_TYPE_NAMING:
			checker = namingChecker;
			break;
		default:
			return warnings;
		}
		try {
			checker.ReInit(is);
			checker.resetVariables();
			checker.CompilationUnit();
			warnings = checker.getWarnings();
		} catch (ParseException e) {
			e.printStackTrace();
			return warnings;
		}
		return warnings;
	}
}
