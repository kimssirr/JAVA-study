package DateAndTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint); // 현재 날짜&시각
        System.out.println(timePoint.getMonth()); // 현재 달 영어로
        // 2012년 12월 12일의 시간에 대한 정보를 가지는 LocalDate객체를 만드는 방법
        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld1);
        // 17시 19분에 대한 LocalTime객체를 구한다.
        LocalTime lt1 = LocalTime.of(17,19);
        System.out.println(lt1);
        // 10시 15분 30초라는 문자열에 대한 LocalTime객체를 구한다.
        LocalTime lt2 = LocalTime.parse("10:15:30");
        //날짜 구하기
        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);

        Month month = timePoint.getMonth();
        int day = timePoint.getDayOfMonth();
        int hour = timePoint.getHour();
        int minute = timePoint.getMinute();
        int second = timePoint.getSecond();
        // 달을 숫자로 출력한다 1월도 1부터 시작하는 것을 알 수 있습니다.
        System.out.println(month.getValue() + "월 " + day + "일 " + hour%12 + ":" + minute + ":" + second);
    }
}
