package core.checker;

import java.util.Vector;

import core.rules.RulesManager;
import core.warning.Warning;

public abstract class Checker {
	public abstract void CompilationUnit() throws ParseException;

	public abstract void ReInit(java.io.InputStream stream);

	// custom methods

	public final Vector<Warning> warnings = new Vector<Warning>();
	public RulesManager rm;
	final public State state = new State();

	public void resetVariables() {
		state.reset();
		warnings.clear();
	}

	public Vector<Warning> getWarnings() {
		return warnings;
	}

	public RulesManager getRulesManager() {
		return rm;
	}

	public State getState() {
		return state;
	}
}
