package core.checker;

public class WarningComment extends Warning {

	/*
	 * args[0] = kind
	 * args[1] = name
	 */
	
	public static String BEGIN = "beginning of the file";
	public static String CLASS = "Class";
	public static String INTERFACE = "Interface";
	public static String ENUM = "Enum";
	public static String FIELD = "Field";
	public static String VARIABLE = "Variable";
	public static String CONSTANT = "Constant";
	public static String METHOD = "Method";
	public static String CONSTRUCTOR ="Constructor";
	
	public WarningComment() {
		// TODO Auto-generated constructor stub
	}

	public WarningComment(Position p, String[] args) {
		set(p, args, TYPE_COMMENT);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("At line " + pos.beginLine + ": ");
		s.append("Adding/using block comment before " + args[0]);
		if (!args[0].equals(BEGIN)){
			s.append(" definition '" + args[1] + "'");
			
		}
		return s.toString();
	}

}
