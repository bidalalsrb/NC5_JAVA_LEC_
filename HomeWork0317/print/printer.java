package HomeWork0317.print;

public class printer {
	String model;
	String maker;
	String inter;
	int cnt;
	int per;

	public void info(String model, String maker, String inter, int cnt, int per) {
		System.out.println("모델명 : " + model);
		System.out.println("제조사 : " + maker);
		System.out.println("인터페이스 : " + inter);
		System.out.println("인쇄매수 : " + cnt);
		System.out.println("인쇄 종이 잔량 : " + per);

	}
}
