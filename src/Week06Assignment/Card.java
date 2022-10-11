package Week06Assignment;

public class Card {
	private int value = 0;
	private String name = "";
	public int getvalue() {
		return value;
	}
	
	public void setvalue(int newvalue) {
		this.value = newvalue;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String newname) {
		this.name = newname;
	}
	
	public void discribe() {
		System.out.println(value + " of " + name);
	}
}
