package HomeWork0324.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class basic02 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String strToday =sdf.format(cal.getTime());
        System.out.println(strToday);
    }
}
