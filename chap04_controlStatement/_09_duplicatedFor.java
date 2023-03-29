package chap04_controlStatement;

public class _09_duplicatedFor {
	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { if (i >= j)
		 * System.out.print("*"); } System.out.println("");
		 * 
		 * } System.out.println(""); for (int i = 0; i < 5; i++) { for (int j = 0; j <
		 * 5; j++) { if (i <= j) System.out.print("*"); } System.out.println(""); }
		 * 
		 * System.out.println(""); for (int i = 0; i < 5; i++) { for (int j = 0; j < 5;
		 * j++) { if (i <= j) System.out.print("*"); else System.out.print(" "); }
		 * System.out.println("");
		 * 
		 * }
		 */

		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j < 0; j--) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
