package HomeWork0324.mid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class mid1 {
    //    . 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//    yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//    parse() 메소드를 이용하면 String -> Calendar로 변환가능)
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 yyyy-MM-dd 형식으로 입력하세요: ");
        String inputDate = sc.nextLine();

        // 입력받은 문자열을 Calendar 객체로 변환
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(inputDate);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // 3일을 더하기
        calendar.add(Calendar.DAY_OF_MONTH, 3);

        // 결과 출력
        String resultDate = dateFormat.format(calendar.getTime());
        System.out.println("3일 뒤의 날짜는 " + resultDate + " 입니다.");

    }
}
