package chap15_usefulClass;

import java.util.Calendar;

public class _19_differenceOfTwoDate {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d2.set(2022, 2, 11);
        //getTimeInMill() : long타입으로 지정된 날짜를 밀리세컨드로 리턴.

        long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
        System.out.println("d2부터 d1까지" + (diff / 1000) + "초가 지났습니다");
        System.out.println("d2부터 d1까지" + (diff / (1000 * 60)) + "분이 지났습니다");
        System.out.println("d2부터 d1까지" + (diff / (1000 * 60 * 60)) + "시간이 지났습니다");
        System.out.println("d2부터 d1까지" + (diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다");
        System.out.println("d2부터 d1까지" + (diff / 1000 / 60 / 60 / 24 / 30) + "달이 지났습니다");
        System.out.println("d2부터 d1까지" + (diff / 1000 / 60 / 60 / 24 / 30 / 12) + "년이 지났습니다");
        toString(diff);
    }

    public static void toString(long a) {
        long y, m, d, h, mm;
        a /= 1000;
        mm = a / 60;
        h = mm / 60;
        d = h / 24;
        m = d / 30;
        y = m / 12;
        System.out.println("몇년 " + y + "몇달 " + m + "몇일" + d + "몇시간 " + h + "몇분" + mm + "몇초 " + a);
    }

}
