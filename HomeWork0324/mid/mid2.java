package HomeWork0324.mid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//        사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
public class mid2 {


    public static void main(String[] args) {
        // 요일 배열 생성
        String[] weekdays = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        // 사용자로부터 날짜 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("날짜를 입력하세요(yyyy-MM-dd): ");
        String dateString = scanner.nextLine();

        // 입력받은 문자열을 LocalDate 객체로 변환
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // 요일 출력
        int dayOfWeek = date.getDayOfWeek().getValue(); // 1: 월요일, 2: 화요일, ..., 7: 일요일
        String weekday = weekdays[dayOfWeek-1];
        System.out.println(dateString + "은 " + weekday + "입니다.");
        }

    }

