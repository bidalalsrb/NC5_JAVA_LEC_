package chap06_class;

import chap06_class.calc.Multiple;

public class _03_overloading {

	public static void main(String[] args) {
		Multiple multi = new Multiple();
		multi.setNum1(4);
		multi.setNum2(3);
		
		System.out.println("매개변수가 없는 multi() : ");
		System.out.println(multi.multi());
		System.out.println("매개변수가 한 개인 multi() : ");
		System.out.println(multi.multi(4));
		System.out.println("매개변수가 두 개인 multi() : ");
		System.out.println(multi.multi(4,3));
	}

}
