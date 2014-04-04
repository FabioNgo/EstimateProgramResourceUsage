package core.checker;

public abstract class Warning {
	final public int TYPE_NAMING = 1;
	final public int TYPE_INDENT = 2;
	final public int TYPE_COMMENT = 3;

	Position pos;
	String args[];
	int type;

	public Warning() {
	}

	public Warning(Position p, String args[], int type) {
		set(p, args, type);
	}

	public void set(Position p, String args[], int type) {
		pos = new Position(p);
		this.type = type;
		this.args = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			this.args[i] = args[i].toString();
		}
	}

	public abstract String toString();
}