package chap07_Inherit.Car;

public class HyundaiCarInherit extends Car {
	public String company;
	public String model;
	public String color;
	public int price;


	public void speedUp() {
		System.out.println("스피드 업.");
	}

	public void speedDown() {
		System.out.println("스피드 다운.");
	}
}
