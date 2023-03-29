package chap06_class.animal;

public class Bird {
	public int wing;
	public String color;
	public String name;
	public int size;
	public String food;

	public Bird(String name, String food){
		this.name = name;
		this.food = food;
		
	}
	
	public void BirdInput(int wing, String color, String name, int size, String food) {
		this.wing = wing;
		this.color = color;
		this.name = name;
		this.size = size;
		this.food = food;
	}

	public void fly() {
		System.out.println(name + "는 날개를 이용하여 하늘을 납니다");
	}

	public void cry() {
		System.out.println(name + "는 나무에 앉아 웁니다");
	}

	public void walk() {
		System.out.println(name + "는 땅을 걷는다");
	}

	public void eat() {
		System.out.println(name + "는 " + food + "을 먹는다");
	}

}
