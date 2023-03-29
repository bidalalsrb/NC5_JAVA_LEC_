package chap07_Inherit;

import chap07_Inherit.Car.Car;
import chap07_Inherit.Car.HyundaiCar;
import chap07_Inherit.Car.HyundaiCarInherit;
import chap07_Inherit.Car.KiaCar;
import chap07_Inherit.Car.KiaCarInherit;

public class _01_withOutInherit {

	public static void main(String[] args) {
		// 1. 객체생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();

		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		// 자식클래스는 부모의 형태도 가지고 있기 때문에
		// 부모클래스로 만들어진 변수에 대입가능하다
		Car car1 = new KiaCarInherit();
		car1.company = "kia";
		car1.carInfo();
		// 다형성의 기초
		// 같은 모양의 객체로 전혀 다른 결과값을 도출하는 성질
		car1.speedUp();
		car1.speedDown();
		
		car1 = new HyundaiCarInherit();
		car1.company = "hyundai";
		car1.carInfo();
		car1.speedUp();
		car1.speedDown();

	}

}
