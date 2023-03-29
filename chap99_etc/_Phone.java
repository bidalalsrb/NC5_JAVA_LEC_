package chap99_etc;

import java.util.Scanner;

class PhoneBook {
	String name;
	String number;

}

public class _Phone {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("--------전화번호 저장하기--------");
		System.out.println("사용자  수 입력");
		int num = Integer.parseInt(scn.nextLine());
		PhoneBook[] phonebook = new PhoneBook[num];
		for (int i = 0; i < phonebook.length; i++) {
			phonebook[i] = new PhoneBook();
			System.out.println((i + 1) + "이름 입력");
			phonebook[i].name = scn.nextLine();
			System.out.println((i + 1) + "번호 입력");
			phonebook[i].number = scn.nextLine();
		}
		System.out.println("저장 완 료");

		System.out.println(" 전화 번호 검 색 하기 ");
		while (true) {

			System.out.println("검색할 이름 입력");
			String name = scn.nextLine();
			if (name.equalsIgnoreCase("stop")) {
				System.out.println("프로그램 종료");
				break;
			}
			int check = -1;
			for (int i = 0; i < phonebook.length; i++) {
				if (name.equals(phonebook[i].name)) {
					System.out.println(phonebook[i].number);
					check = 1;

				}

			}
			if (check == -1) {
				System.out.println("없는 이름입니다");
			}
		}
	}

}
