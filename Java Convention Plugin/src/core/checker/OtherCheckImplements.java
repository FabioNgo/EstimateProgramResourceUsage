package core.checker;

import core.rules.Rule;
import core.rules.RuleRange;
import core.rules.RuleType;
import core.warning.Position;
import core.warning.Warning;
import core.warning.WarningOther;

public class OtherCheckImplements {
	/**
	 * Return a warning if there is a rule generates one
	 * 
	 * @param t
	 *            = token of the next token after "(" Condition() ")" or "else"
	 */
	public static Warning IF_MustUseBracket(Checker c, Token t) {
		WarningOther warning = null;
		for (RuleRange rg : RuleRange.values()) {
			if (c.rm.isActive(RuleType.IF_MustUseBracket, rg)) {
				if (!t.image.equals("{")) {
					Rule r = c.rm.searchRule(RuleType.IF_MustUseBracket, rg);
					if (!c.state.isInRange(rg))
						break;
					Position pos = new Position(t);
					String s[] = new String[] { r.getMessage(null) };
					warning = new WarningOther(pos, null, s);
				}
			}
		}
		return warning;
	}

	/**
	 * Return a warning if there is a rule generates one
	 * 
	 * @param t
	 *            = token of "else"
	 */
	public static Warning IF_NotAllowElse(Checker c, Token t) {
		WarningOther warning = null;
		for (RuleRange rg : RuleRange.values()) {
			if (c.rm.isActive(RuleType.IF_NotAllowElse, rg)) {
				Rule r = c.rm.searchRule(RuleType.IF_NotAllowElse, rg);
				if (!c.state.isInRange(rg))
					break;
				Position pos = new Position(t);
				String s[] = new String[] { r.getMessage(null) };
				warning = new WarningOther(pos, null, s);
			}
		}
		return warning;
	}

	/**
	 * Return a warning if there is a rule with type
	 * SWITCH_MustHaveDefaultBranch When call this method, client must sure that
	 * there was not default branch
	 * 
	 * @param t
	 *            = the last "}" of the switch statement
	 */
	public static Warning SWITCH_MustHaveDefaultBranch(Checker c, Token t) {
		WarningOther warning = null;
		for (RuleRange rg : RuleRange.values()) {
			if (c.rm.isActive(RuleType.SWITCH_MustHaveDefaultBranch, rg)) {
				Rule r = c.rm.searchRule(RuleType.SWITCH_MustHaveDefaultBranch,
						rg);
				if (!c.state.isInRange(rg))
					break;
				Position pos = new Position(t);
				String s[] = new String[] { r.getMessage(null) };
				warning = new WarningOther(pos, null, s);
			}
		}
		return warning;
	}
}
