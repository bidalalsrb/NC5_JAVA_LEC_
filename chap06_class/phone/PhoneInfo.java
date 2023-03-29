package chap06_class.phone;

import java.util.Scanner;

public class PhoneInfo {
	// 이름 100개와 전화번호 100개를 담을 수 있는 배열 2개
	// 배열의 현재 인덱스를 담고 있을 변수

	String[] name = new String[100];
	String[] num = new String[100];
	
	Scanner sc = new Scanner(System.in);
	public void Ui() {
		System.out.println("----연락처 목록----");
		System.out.println("1. 정보 입력");
		System.out.println("2. 모든 정보 출력");
		System.out.println("3. 인덱스로 정보 검색");
		System.out.println("4. 종료");
	}
	// 전달받은 이름과 전화번호를 저장하는 메소드
	int i = 0;
	public void insertPhoneNum() {
		name[i] = sc.next();
		num[i] = sc.next();
		i++;
	}

	// 저장된 모든 이름과 전화번호를 출력하는 메소드 // 조회
	// printAllPhoneNum
	// ex) 이름 : 홍길동, 전화번호 : 11111111
	public void printAllPhoneNum() {
		for (i = 0; i < 100; i++) {
			if (num[i] != null) {
				System.out.println(i + 1 + "번 " + "이름은 : " + name[i] + " 번호는 : " + num[i]);
			}
		}
	}

	// 전달받은 번호의 해당하는 이름과 전화번호를 출력하는 메소드
	// printPhoneNum
	public void printPhoneNum(int input) {
		System.out.println("이름은 :" + name[input] + "번호는 : " + num[input]);
	}
}
