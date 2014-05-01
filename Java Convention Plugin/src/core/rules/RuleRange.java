package core.rules;

/**
 * Defined Rule Range must be specified in RuleReader.jj too
 */
public enum RuleRange {
	FILE(0),

	CLASS(1),

	ENUM(1),

	INTERFACE(1),

	METHOD(2),

	CONSTRUCTOR(2),

	FIELD(2),

	VARIABLE(3);

	private final int level;

	private RuleRange(int i) {
		level = i;
	}

	/**
	 * Check if rt1 include rt2 For example, File includes Class, Class includes
	 * Method
	 */
	public static boolean include(RuleRange rt1, RuleRange rt2) {
		return rt1.include(rt2);
	}

	public boolean include(RuleRange rg) {
		if (this == FIELD || this == VARIABLE)
			return false;
		if (this == INTERFACE && rg == CONSTRUCTOR)
			return false;
		if (this != rg && level == 2 && rg.level == 2)
			return false;
		if (this.level > rg.level)
			return false;
		return true;
	}
	
	public boolean includedBy(RuleRange rg){
		return rg.include(this);
	}
}
