package HomeWork0315;

import java.util.Scanner;

public class Mid02 {
	public static void main(String[] args) {
		System.out.println("0 : 가위 1: 바위 2 : 보");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (true) {
			int com = (int) (Math.random() * 2) + 1;
			System.out.println(com);

			if (input == com) // 1 vs 0,1,2
				System.out.println("무승부");
			else if (input == 1 && com == 0) {
				System.out.println("승리");
				break;
			}
			else if (input == 1 && com == 2) {
				System.out.println("패배");
				break;
			}
			else if (input == 0 && com == 1) {
				System.out.println("패배");
				break;
			}
			else if (input == 0 && com == 2) {
				System.out.println("승리");
				break;
			}
			else if (input == 2 && com == 1) {
				System.out.println("패배");
				break;
			}
			else if (input == 2 && com == 0) {
				System.out.println("승리");
				break;
			}
		}
	}
}
