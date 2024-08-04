package DateAndTime;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        //현재로부터 100일 뒤 날짜 구하기
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,100);
        System.out.println(c.get(Calendar.YEAR)+"년"+(c.get(Calendar.MONTH)+1)+"월"+c.get(Calendar.DATE)+"일");
    }
}
