package core.checker;

public class WarningSpace extends Warning {
	public static String INDENT = "Indentation";
	public static String NEWLINE = "Should be go to a new line";
	public static String NOTNEWLINE = "should not go to a new line";
	public static String BLANKLINE = "should have a blank line";
	public static String NOTBLANKLINE = "should not have a blank line";
	public static String ENDSPACE = "Space at the end of a statement";
	public static String SPACE = "Space between tokens";
	public static String COMMENTSPACE = "Space before comment";
	public static String INNERCOMMNET = "Comment inside statement";
	public static String SINGLELINECOMMENT = "Comment should be on a line itself ";
	public static String ENDLINECOMMENT = "Should have new line after comment";
	private String type;

	public WarningSpace() {
		super();
	}

	public WarningSpace(Position p, String[] args, String type) {
		super(p, args, Warning.TYPE_SPACE);
		this.type = type;

	}

	@Override
	public String toString() {
		String result = "";
		if (type == SINGLELINECOMMENT) {
			result = "Comments should be in separated lines";
			return result;
		}
		if (type == INDENT) {
			result = "Not good indentation.";
			if (args[0] == "false") {
				result += " The indent should be " + args[1] + " tab(s)";
				return result;
			}
		}
		if (type == ENDLINECOMMENT) {
			result = "A new line should be placed after a comment";
			return result;
		}
		if (type == ENDSPACE) {
			result = "Space shoud not be places at the end of line";
			return result;
		}
		if (type == COMMENTSPACE) {
			if (Integer.valueOf(args[0])== Integer.valueOf(1)) {
				result = "One space shoud be placed before comment";
			} else {
				result = "Space(s) shoud not be placed  before comment";
			}
			return result;
		}
		if (type == NEWLINE) {
			result = "A return character should be placed in the end of the line";
			return result;
		}
		if (type == NOTNEWLINE) {
			result = "A return character should not be placed in the end of the line";
			return result;
		}
		if (type == BLANKLINE) {
			result = "A blank line should be placed after this line";
			return result;
		}
		if (type == NOTBLANKLINE) {
			result = "A blank line should not be placed here";
			return result;
		}
		if (type == INNERCOMMNET) {
			result = "Comment should not be inside statement";
			return result;
		}
		if (type == SPACE) {
			
			result = "Number of spaces should be " + args[0] + " after '" + args[1]+"'";
			return result;
		}

		return "";
	}
}