package HomeWork0324.mid;
//3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//        시 분 초 형태로 나타내시오.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mid3 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 = formatter.parse("2023-03-15 20:31:45");
        Date date2 = formatter.parse("2021-07-08 11:58:04");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);

        long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
        long hours = diff / (60 * 60 * 1000);
        long minutes = (diff / (60 * 1000)) % 60;
        long seconds = (diff / 1000) % 60;

        System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초 차이입니다.");
    }


}

