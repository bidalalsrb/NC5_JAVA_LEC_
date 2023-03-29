package HomeWork0316.review;

import java.util.Scanner;

public class basic2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int n = 11;
		for (int i = 0; i < arr.length; i++) {
			n = n - 1;
			System.out.println("정수를 입력하세요(남은 횟수: " + n + "번)");

			arr[i] = sc.nextInt();
			sum += arr[i];

		}
		System.out.println("입력한 정수:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("총합: " + sum);
	}
}
