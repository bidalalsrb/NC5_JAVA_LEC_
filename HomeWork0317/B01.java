package HomeWork0317;

import HomeWork0317.print.Ink;
import HomeWork0317.print.printer;

public class B01 {
	String model;
	String maker;
	String inter;
	int cnt;
	int per;

	public static void main(String[] args) {

		printer print = new printer();

		print.info("ipgo", "ssam", "USB", 5, 5);

		print = new Ink();

	}

}
