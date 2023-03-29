package HomeWork0314;

import java.util.Scanner;

public class _01_age20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		int age =scn.nextInt();
		String result = (age >= 30) ? "20대가 아닙니다" : (age >= 20 && age <=29) ? "20대 입니다" : "";
		System.out.println(result);
		
	
	}
}
