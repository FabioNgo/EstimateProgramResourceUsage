package core.checker;

public class IndentLevel {
	String image;
	int lvl;
	public IndentLevel(String image, int lvl){
		this.image = image;
		this.lvl = lvl;
	}
	public IndentLevel(){
		image = "";
		lvl = -1;
	}
	public String toString(){
		String result = "";
		result = image + " " + lvl;
		return result;
	}
}
