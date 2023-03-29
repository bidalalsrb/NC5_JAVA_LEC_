package chap99_etc;

import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~200사이의 숫자를 입력하시오. :");
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		// 컴퓨터는 변수에 1~200랜덤값

		int com = (int) (Math.random() * 200) + 1;
		System.out.println(com);

		while (true) {
			int inputNum = sc.nextInt();
			if (inputNum == com) {
				System.out.println("축하합니다");
				System.out.println("계속 하시겠습니까? 1 계속 , 0 종료");
				int one = sc1.nextInt();
				
				if (one == 1) {
					System.out.println("시작합니다");
					continue;
				} else if (one == 0) {
					System.out.println("종료합니다");
					break;
				}
			} 
			
			else {
				System.out.println("틀렸습니다");
			}

		}sc.close();
		
		
	}

}
