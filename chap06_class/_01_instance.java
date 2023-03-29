package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		Add add = new Add();
		Divide divide = new Divide();
		Minus minus = new Minus();
		Multiple multiple = new Multiple();

		add.setNum1(6);
		add.setNum2(2);
		add.setResult(add.getNum1() + add.getNum2());
		divide.setNum1(6);
		divide.setNum2(2);
		divide.setResult(divide.getNum1() / divide.getNum2());
		minus.setNum1(6);
		minus.setNum2(2);
		minus.setResult(minus.getNum1() - minus.getNum2());
		multiple.setNum1(6);
		multiple.setNum2(2);
		multiple.setResult(multiple.getNum1() * multiple.getNum2());

		System.out.println(add.add());
		System.out.println(divide.divide());
		System.out.println(minus.minus());
		System.out.println(multiple.multi());

		// 설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		// 인스턴스화 : 생성자를 통해 객체를 생성하고 heap메모리 영역 저장
		// 항상 new 키워드()와 함께 사용
		Calc calc = new Calc();

		int receiveNum = calc.add(10, 20);
		// 리턴 값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고 연산이 일어난 후 삭제
		calc.add(10, 20);

		System.out.println(calc.minus(calc.add(100, 20), calc.multi(10, 20)));
		
		Calc calc2 = new Add();
		System.out.println(calc2.add(4, 3));
		Calc calc3 = new Minus();
		System.out.println(calc3.minus(4, 3));
		
	}

}
