package core.checker;

import java.util.Vector;

public interface IChecker {
	void CompilationUnit() throws ParseException;

	void ReInit(java.io.InputStream stream);
	
	void resetVariables();
	
	Vector<Warning> getWarnings(); 
}
