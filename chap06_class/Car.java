package chap06_class;

public class Car {
	// 제조자company 모델model 색상 color 가격 price

	public String company;
	public String model;
	public String color;
	public int price;

	public Car() { // 기본 생성자 . 매개변수가 없다
		//String은 null로 초기화되기 때문에
		//데이터에 null이 존재하면 예외가 발생활 확률이
		// 높아지므로 ""로 초기화한다.
		System.out.println("기본 생성자 호출");
	}

	public Car(String c) { // 해당 변수 초기화
		company = c;
		System.out.println("매개변수 하나인 생성자 호출");
	}

	public Car(String c, String m) {
		company = c;
		model = m;
		System.out.println("매개변수 두 개인 생성자 호출");
	}

	@Override
	public String toString() {
		return "Car{" +
				"company='" + company + '\'' +
				", model='" + model + '\'' +
				", color='" + color + '\'' +
				", price=" + price +
				'}';
	}

	public Car(String company, String model, String color) {
		//매개변수명은 어떤 멤버변수를 초기화할지 명확하게 하기 위해
		//멤버변수명과 일치시킨다.
		//생성되는 객체 자체를 가르키는 this 키워드 사용해서
		//멤버변수를 지칭하도록 한다.
		this.company = company;
		this.model = model;
		this.color = color;
		System.out.println("매개변수 세 개인 생성자 호출");
	}
	public Car(String company, String model, String color, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		System.out.println("매개변수 네 개인 생성자 호출");
	}
	

	public void carInput(String company, String model, String color, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;

	}

	public void carInfo() {
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.color);
		System.out.println(this.price);
	}

//carinfo() -> 입력한 자동차 정보 출력
// 제조사 현대 모델 제니시스 색상 검정 가격 5000
	public static void main(String[] args) {
		Car c = new Car();
		c.carInput("d", "@", "2", 3);
		c.carInfo();
		c.carInput("A", "!", "3", 9);
		c.carInfo();

	}

}
