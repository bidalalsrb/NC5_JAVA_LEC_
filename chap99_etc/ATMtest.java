package chap99_etc;

import javax.swing.JOptionPane;

class Money {
	String name;
	String password;
	int money;
	int account;
	int chance = 3;

	public Money() {
	}

	void createAccount() {
		while (true) {
			String msg = " 통장을 개설하시겠습니까? ";
			msg += "yes : 1번    no : 2번";
			int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));
			if (choice == 1) {
				name = JOptionPane.showInputDialog("이름을 입력하세요");
				account = Integer.parseInt(JOptionPane.showInputDialog("계좌를 입력하세요"));
				password = JOptionPane.showInputDialog("비밀번호를 설정하세요");

				String msg2 = name + "님의 통장이 개설되었습니다";
				msg2 += "계좌번호" + account;
				JOptionPane.showInternalMessageDialog(null, msg2);
				break;
			} else if (choice == 2) {
				JOptionPane.showInternalMessageDialog(null, "프로그램을 종료합니다");
				System.exit(0);
			} else {
				JOptionPane.showInternalMessageDialog(null, "잘못된 입력입니다");
			}
		}
	}

	int showMenu() {
		String menu = " ***ASE코리아 ATN ***\n";
		menu += " 1. 입금 \n";
		menu += " 2. 출금 \n";
		menu += " 3. 잔액조회 \n";
		menu += " 4. 계좌이체 \n";
		menu += " 5. 종료 \n";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "메뉴를 선택하세요"));
		return choice;
	}

	void choiceMenu() {
		while (true) {
			int choice = showMenu();
			if (choice > 5 || choice < 1) {
				JOptionPane.showInternalMessageDialog(null, "잘못된입력니다.");
				choice = showMenu();
			}
			if (choice == 5) {
				JOptionPane.showInternalMessageDialog(null, "프로그램을 종료합니다");
				System.exit(0);
			}
			if (checkPassword()) {
				switch (choice) {
				case 1:
					deposit();
					break;
				case 2:
					withDraw();
					break;
				case 3:
					checkMoney();
					break;
				case 4:
					transfer();
					break;

				default:
					break;

				}
			}
		}
	}

	boolean checkPassword() {
		boolean check = false;
		while (true) {
			String checkPassword = JOptionPane.showInputDialog("비밀번호를 입력하세요 (기회" + chance + "번");
			if (password.equals(checkPassword)) {
				check = true;
				break;
			} else if (chance != 1) {
				chance--;
				JOptionPane.showInternalMessageDialog(null, "비밀번호를 다시 입력하시오");
			} else if (chance == 1) {
				JOptionPane.showInternalMessageDialog(null, "비밀번호 3회 오류 . 프로그램을 종료합니다.");
				System.exit(0);

			}
		}
		return check;
	}

	void transfer() {
		String oName = JOptionPane.showInputDialog("이체할 사용자의 이름을 입력해주세요");
		String oAccount = JOptionPane.showInputDialog("이체할 은행의 계좌번호를 입력해주세요");
		int oMoney = Integer.parseInt(JOptionPane.showInputDialog("이체할 금액을 입력해주세요"));

		if (oMoney > money) {
			JOptionPane.showInternalMessageDialog(null, "잔액이 부족합니다");
		} else {
			money -= oMoney;
			String msg = oAccount + "(" + oName + ")으로" + oMoney + "원 이체하였습니다";
			JOptionPane.showInternalMessageDialog(null, msg);
		}
		checkMoney();
	}

	void deposit() {
		int deposit = Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하시오"));
		money += deposit;
		checkMoney();
	}

	void withDraw()

	{
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("출금할 금액을 입력하시오"));
		if (money < withdraw) {
			JOptionPane.showInternalMessageDialog(null, "잔액이 부족합니다");
		} else {
			money -= withdraw;
		}
		checkMoney();
	}

	void checkMoney() {
		JOptionPane.showInternalMessageDialog(null, "남은 잔액은 " + money + "원 입니다");
	}

	void run() {
		createAccount();
		choiceMenu();
	}
}

public class ATMtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money myMoney = new Money();
		myMoney.run();
	}

}
