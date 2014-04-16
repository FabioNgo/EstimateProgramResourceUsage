package core.checker;

public class Position {
	public int beginLine, beginColumn, endLine, endColumn; 

	public void set(Position p) {
		beginLine = p.beginLine;
		endLine = p.endLine;
		beginColumn = p.beginColumn;
		endColumn = p.endColumn;
	}

	public Position(Position p) {
		set(p);
	}
	
	public Position(int bLine, int eLine, int bCol, int eCol){
		beginLine = bLine;
		endLine = eLine;
		beginColumn = bCol;
		endColumn = eCol;
	}
}