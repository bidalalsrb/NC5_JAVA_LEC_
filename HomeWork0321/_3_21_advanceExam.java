package HomeWork0321;

import java.util.Scanner;

public class _3_21_advanceExam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean isExit = false;
        _3_21_Employee emp = null;
        while(true) {




            System.out.println("메뉴 선택");
            System.out.println("1. 정규직 저장");
            System.out.println("2. 임시직 저장");
            System.out.println("3. 계약직 저장");
            System.out.println("4. 전체 정보 출력");
            System.out.println("5. 월급 계산 출력");
            System.out.println("6. 프로그램 종료");

            Scanner sc = new Scanner(System.in);
            int userNum = sc.nextInt();
            switch(userNum) {
                case 1:
                    emp = new _3_21_fullTimeJob(1, "철수", 300, 1000);
                    break;
                case 2:
                    emp = new _3_21_temporaryJob(2, "지석", 250, 2020);
                    break;
                case 3:
                    emp = new _3_21_contractWorker(3, "하얀", 10, 20);
                    break;
                case 4:
                    emp.showEmployeeInfo();
                    break;
                case 5:
                    System.out.println(emp.getMonthPay());
                    break;
                case 6:
                    isExit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    continue;
            }
            if(isExit) {
                break;
            } else {
                continue;
            }

        }
    }

}