package HomeWork0317;

import HomeWork0317.four.Add;
import HomeWork0317.four.Calc;
import HomeWork0317.four.Div;
import HomeWork0317.four.Mul;
import HomeWork0317.four.Sub;

public class calculate {

	public static void main(String[] args) {

		Calc[] calcArr = new Calc[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();

		calcArr[0].setValue(4, 2);
		System.out.println("1 " + calcArr[0].calculate());
		calcArr[1].setValue(4, 2);
		System.out.println("2 " + calcArr[1].calculate());
		calcArr[2].setValue(4, 2);
		System.out.println("3 " + calcArr[2].calculate());
		calcArr[3].setValue(4, 2);
		System.out.println("4 " + calcArr[3].calculate());

	}

}
