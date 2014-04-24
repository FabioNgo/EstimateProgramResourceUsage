package core.checker;

public class WarningOther extends Warning {
	
	public WarningOther(){
		
	}
	
	public WarningOther(Position p, String[] args) {
		set(p, args, TYPE_OTHER);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return args[0];
	}

}
