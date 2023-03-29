package HomeWork0324.AD;

import java.util.Calendar;
import java.util.Scanner;

public class ad {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("년도를 입력하세요: ");
            int year = scanner.nextInt();
            scanner.close();

            // Calendar 객체를 생성하여 결혼 기념일인 2001년 12월 19일로 초기화
            Calendar cal = Calendar.getInstance();
            cal.set(2001, Calendar.DECEMBER, 19);

            // 입력받은 년도가 2001년보다 큰 경우에만 윤년 여부를 체크
            if (year > 2001) {
                // 해당 년도까지의 윤년 개수를 계산
                int leapYears = (year - 2001) / 4 - (year - 2001) / 100 + (year - 2001) / 400;
                cal.add(Calendar.DAY_OF_YEAR, leapYears
                        // 결혼 기념일에 윤년이 포함되어 있으면 하루+1, 아니면 +0
                        + (isLeapYear(year) ? 1 : 0));
            }

            // 결혼 기념일을 출력
            System.out.printf("%d년 결혼 기념일은 %d월 %d일입니다.", year, cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE));
        }

        // 윤년 여부를 판별하는 메소드
        private static boolean isLeapYear(int year){
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
    }
