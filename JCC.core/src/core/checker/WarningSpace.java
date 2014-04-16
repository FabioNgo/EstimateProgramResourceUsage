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
			result = "Wrong indentation.";
			if (args[0] == "false") {
				result += " The correct one is " + args[1] + " tab(s)";
				return result;
			}
		}
		if (type == ENDLINECOMMENT) {
			result = "Should be on a new line after a comment";
			return result;
		}
		if (type == ENDSPACE) {
			result = "Should not leave space at the end of line";
			return result;
		}
		if (type == COMMENTSPACE) {
			if (Integer.valueOf(args[0])== Integer.valueOf(1)) {
				result = "Should have one space before comment";
			} else {
				result = "Should have no space before comment";
			}
			return result;
		}
		if (type == NEWLINE) {
			result = "Should go to a new line";
			return result;
		}
		if (type == NOTNEWLINE) {
			result = "Should not go to a new line";
			return result;
		}
		if (type == BLANKLINE) {
			result = "Should have a blank line";
			return result;
		}
		if (type == NOTBLANKLINE) {
			result = "Should not have blank line";
			return result;
		}
		if (type == INNERCOMMNET) {
			result = "Comment should not be inside statement";
			return result;
		}
		if (type == SPACE) {
			
			result = "Col: " + pos.beginColumn + ", " +
					"Number of spaces should be " + args[0] + "";
			return result;
		}

		return "";
	}
}