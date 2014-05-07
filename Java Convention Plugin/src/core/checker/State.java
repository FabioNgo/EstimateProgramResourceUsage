package core.checker;

import core.rules.RuleRange;

public final class State {
	public boolean isFinal;
	public boolean isField;
	public boolean isInSwitch;

	public String inClass;
	public String inInterface;
	public String inEnum;
	public String inMethod;
	public String inConstructor;
	public boolean hasDefaultConstructor;
	public String inPackage;

	/**
	 * return if the state of current token is in the Range rg
	 */
	public boolean isInRange(RuleRange rg) {
		if (inClass != null && rg.include(RuleRange.CLASS))
			return true;
		if (inInterface != null && rg.include(RuleRange.INTERFACE))
			return true;
		if (inEnum != null && rg.include(RuleRange.ENUM))
			return true;
		if (inMethod != null && rg.include(RuleRange.METHOD))
			return true;
		if (inConstructor != null && rg.include(RuleRange.CONSTRUCTOR))
			return true;
		return false;
	}

	State() {
		reset();
	}

	public void reset() {
		isFinal = false;
		isField = false;
		isInSwitch = false;
		inClass = null;
		inInterface = null;
		inEnum = null;
		inMethod = null;
		inConstructor = null;
		hasDefaultConstructor = false; 
		inPackage = null;
	}
}