package chap06_class.phone;

import java.util.Scanner;

public class OutPhone {

	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		Scanner sc = new Scanner(System.in);

		while (true) {
			p.Ui();
			int check = sc.nextInt();
			switch (check) {
			case 1:
				System.out.println("정보 입력해");
				p.insertPhoneNum();
				System.out.println("입력이 완료되었습니다");
				break;
			case 2:
				
				p.printAllPhoneNum();
				break;
			case 3:
				System.out.println("인데스 번호 입력");
				int tree = sc.nextInt();
				p.printPhoneNum(tree);
				break; 
			default:
				break;
			}
			if(check == 4) {
				System.out.println("끝");
				break;
			}
		}
	}

}
