package chap99_etc;

import java.util.Scanner;

public class _14study {

	public static void main(String[] args) {
		int max=0;
		int min;
		int avg;
		int sum;
		// 사용자로부터 세 개의 정수를 입력받아,
		// 그 수들의 최대값과 최소값,
		// 합계와 평균을 구해보자.
		Scanner scan = new Scanner(System.in);
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;

		if (num1 > num2) { // 50 > 40
			max = num1; // max = 50
			if (max > num3) { // 50 > 30
				System.out.println(max);
			}
		}

	}

}
