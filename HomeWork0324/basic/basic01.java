package HomeWork0324.basic;

import java.util.Calendar;

public class basic01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 3, 8);

        cal.add(Calendar.DATE, 3);
        System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) ) + "월" + cal.get(Calendar.DATE) + "일");
        //2달뒤
        cal.add(Calendar.MONTH, 2);
        System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)) + "월" + cal.get(Calendar.DATE) + "일");
        //3일뒤
        cal.add(Calendar.DATE, 3);
        System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)) + "월" + cal.get(Calendar.DATE) + "일");
    }
}
