package core.checker;

public class WarningSpace extends Warning {
	public static String INDENT = "Indentation";
	public static String NEWLINE = "Should be go to a new line";
	public static String NOTNEWLINE = "should not go to a new line";
	public static String ENDSPACE = "Space at the end of a statement";
	public static String SPACE = "Space between tokens";
	public static String COMMENTSPACE = "Space before comment";
	public static String INNERCOMMNET = "Comment inside statement";
	public static String SINGLELINECOMMENT = "Comment should be on a line itself ";
	public static String ENDLINECOMMENT = "Should have new line after comment";
	private String type;
	public WarningSpace(){
		super();
	}
	public WarningSpace(Position p, String[] args, String type) {
		super(p,args,Warning.TYPE_SPACE);
		
		this.type = type;
	}
	@Override
	public String toString() {
		String result = "";
		if(type == SINGLELINECOMMENT ){
			result = "Warning: Line "
		            + pos.beginLine
		            +": Comments should be in separated lines. \n";
			return result;
		}
		if(type == INDENT ){
			result = "Warning: Line "+ pos.beginLine +": Wrong indentation.";
            if(args[0]=="false"){
            	result+= " The correct one is " + args[1] +" tab(s).\n";
            }
			return result;
		}
		if(type == ENDLINECOMMENT){
			result = "Warning: Line " + pos.beginLine +": Should be on a new line after a comment.\n";
			return result;
		}
		if(type == ENDSPACE){
			result = "Warning: Line " + pos.beginLine +": Should not leave space at the end of line.\n";
			return result;
		}
		if(type ==  COMMENTSPACE){
			if(args[0] == "1"){
				result = "Warning: Line " + pos.beginLine +": Should have one space before comment.n";
			}else{
				result = "Warning: Line " + pos.beginLine +": Should have no space before comment.\n";
			}
			return result;
		}
		if(type ==NEWLINE){
			result = "Warning: Line "+ pos.beginLine +": Should go to a new line.\n";
			return result;
		}
		if(type ==NOTNEWLINE){
			result = "Warning: Line "+ pos.beginLine +": Should not go to a new line.\n";
			return result;
		}
		if(type == INNERCOMMNET){
			result = "Warning: Line " + pos.beginLine + ": Comment should not be inside statement.\n";
			return result;
		}
		if(type == SPACE){
			result = "Warning: Line " + pos.beginLine + ", column" + pos.beginColumn
					+ "': Number of spaces should be " + args[0] + ".\n";
			return result;
		}
		//String result = "Warning"
		// TODO Auto-generated method stub
		return null;
	}

}
