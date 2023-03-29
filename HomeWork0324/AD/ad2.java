package HomeWork0324.AD;

import java.util.Calendar;

public class ad2 {
    public static void main(String[] args) {
        //	Calendar 객체를 오늘날짜로 생성하세요.
//	1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//	2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤로 변경하고 출력하세요.
        Calendar cal = Calendar.getInstance();
        cal.set(2023, 3, 24);
        System.out.println((cal.get(Calendar.YEAR)- 3) + "년 " +
                (cal.get(Calendar.MONTH) + 1) + "월 " +
                (cal.get(Calendar.DATE)-16) + "일");

        cal.add(Calendar.YEAR, 5);
        System.out.println(cal.get(Calendar.YEAR) + "년 " +
                cal.get(Calendar.MONTH) + "월 " +
                cal.get(Calendar.DATE) + "일");

        cal.add(Calendar.MONTH, 2);
        System.out.println(cal.get(Calendar.YEAR) + "년 " +
                cal.get(Calendar.MONTH) + "월 " +
                cal.get(Calendar.DATE) + "일");

        cal.add(Calendar.DATE, 3);
        System.out.println(cal.get(Calendar.YEAR) + "년 " +
                cal.get(Calendar.MONTH) + "월 " +
                cal.get(Calendar.DATE) + "일");


    }
}
