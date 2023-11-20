package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime timestamp = LocalDateTime.now();


        System.out.println(timestamp);

        System.out.println(timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(timestamp.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(timestamp.format(DateTimeFormatter.ofPattern("eeee dd MM y 'T' hh:mm:ss")));



    }
}
