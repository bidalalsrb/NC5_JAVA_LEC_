package chap07_Inherit.animal;

public class Bear extends Animal {
	public String fish;
	public String color;

	public Bear() {}

	public Bear(int age, int size, int legCnt, boolean hasWing) {
		super(age, size, legCnt, hasWing);
		// TODO Auto-generated constructor stub
	}

	public Bear(String fish, String color) {
		super();
		this.fish = fish;
		this.color = color;
	}

	public void Hunt() {
		System.out.println("곰이 " + fish + "을 사냥중이다" );
	}
	

	
	

	
}
