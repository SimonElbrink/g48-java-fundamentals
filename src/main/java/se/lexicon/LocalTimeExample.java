package se.lexicon;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();

        LocalTime startOfLecture = LocalTime.of(9,0);
        LocalTime endOfLecture = LocalTime.parse("12:00");

        System.out.println("startOfLecture = " + startOfLecture);
        System.out.println("endOfLecture = " + endOfLecture);



        System.out.println("timeNow = " + timeNow);
        System.out.println(timeNow.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(timeNow.truncatedTo(ChronoUnit.MINUTES));

        LocalTime lunchTime = LocalTime.NOON; // 12:00
        LocalTime min = LocalTime.MIN; // 00:00
        LocalTime max = LocalTime.MAX; // 23:59:999999999

        LocalTime plus_10_hours_plus_5_minutes = timeNow.plusHours(10).plusMinutes(5);
        System.out.println("plus_10_hours_plus_5_minutes = " + plus_10_hours_plus_5_minutes);


        Duration duration = Duration.between(timeNow,LocalTime.MAX);

        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        System.out.println("Hours left to Midnight: "+ hours + " Minutes: " + minutes + " Seconds: " + seconds);




    }
}
