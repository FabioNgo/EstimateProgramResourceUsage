package core.checker;

public class WarningNaming extends Warning {

	/*
	 * args[0] = "class"/"method"/"enum"/"field"/"variable"/... args[1] =
	 * "oldName" args[2] = "newName"
	 */
	
	public static String CLASS = "Class";
	public static String INTERFACE = "Interface";
	public static String ENUM = "Enum";
	public static String FIELD = "Field";
	public static String VARIABLE = "Variable";
	public static String CONSTANT = "Constant";
	public static String METHOD = "Method";

	public WarningNaming() {
	}

	public WarningNaming(Position p, String[] args) {
		set(p, args, TYPE_NAMING);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("");
		s.append(args[0] + " '" + args[1] + "' should be named as '" + args[2]
				+ "'\n");
		s.append("By java convention: " + args[0] + " names should be ");
		if (args[0].equals(CLASS) || args[0].equals(ENUM) || args[0].equals(INTERFACE)) {
			s.append("noun, in mixed case with the first letter of each internal word capitalized.");
		} else if (args[0].equals(FIELD) || args[0].equals(VARIABLE)){
			s.append("nour, in mixed case with a lower case first letter. Internal words start with capital letters.");
		} else if (args[0].equals(METHOD)){
			s.append("verb, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.");
		} else if (args[0].equals(CONSTANT)){
			s.append("nour, in all upper case with words separated by underscores.");
		}
		return s.toString();
	}

}
