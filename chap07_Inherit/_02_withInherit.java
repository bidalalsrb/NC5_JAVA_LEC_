package chap07_Inherit;

import chap07_Inherit.Car.Car;
import chap07_Inherit.Car.HyundaiCar;
import chap07_Inherit.Car.KiaCar;
import chap07_Inherit.Car.KiaCarInherit;

public class _02_withInherit  {

	public static void main(String[] args) {
		//1. 객체생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar =new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		//자식클래스는 부모의 형태도 가지고 있기 때문에
		// 부모클래스로 만들어진 변수에 대입가능하다
		Car car1 = new KiaCarInherit();
		
		
	}

}


