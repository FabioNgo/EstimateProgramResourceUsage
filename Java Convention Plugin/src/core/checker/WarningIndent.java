package core.checker;

public class WarningIndent extends Warning {
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

	public WarningIndent() {
		super();
	}

	public WarningIndent(Position p, String[] args, String type) {
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
			result = "A new line should not appear after a comment";
			return result;
		}
		if (type == ENDSPACE) {
			result = "Space(s) should not appear at the end of line";
			return result;
		}
		if (type == COMMENTSPACE) {
			if (Integer.valueOf(args[0]) == Integer.valueOf(1)) {
				result = "One space should appear before comment";
			} else {
				result = "No space should appear before comment";
			}
			return result;
		}
		if (type == NEWLINE) {
			result = "A new line should be here";
			return result;
		}
		if (type == NOTNEWLINE) {
			result = "A new line should not be here";
			return result;
		}
		if (type == BLANKLINE) {
			result = "A blank line should be here";
			return result;
		}
		if (type == NOTBLANKLINE) {
			result = "Any blank line should not be here";
			return result;
		}
		if (type == INNERCOMMNET) {
			result = "Comment should not be inside statement";
			return result;
		}
		if (type == SPACE) {
			result = "Number of spaces should be " + args[0] + " at column " + pos.beginColumn;
			return result;
		}
		return "";
	}
}