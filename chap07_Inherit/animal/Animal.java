package chap07_Inherit.animal;

public class Animal {
	public int age;
	public int size;
	public int legCnt;
	public boolean hasWing;

	public Animal() {
	}


	public void eat() {
		System.out.println("식사를 한다.");
	}


	public Animal(int age, int size, int legCnt, boolean hasWing) {
		super();
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
	}


}
