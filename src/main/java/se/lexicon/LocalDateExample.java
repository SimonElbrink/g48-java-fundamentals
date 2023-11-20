package se.lexicon;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate christmasEve = LocalDate.parse("2023-12-24");
        //        LocalDate nextBirthDate = LocalDate.of(2024, Month.MARCH,18);
        LocalDate nextBirthDate = LocalDate.of(2024,3,18);

        System.out.println(today);
        System.out.println(nextBirthDate.isLeapYear());

        System.out.println("nextBirthDate.getDayOfWeek() = " + nextBirthDate.getDayOfWeek());
        System.out.println("nextBirthDate.getDayOfYear() = " + nextBirthDate.getDayOfYear());

        System.out.println(  today.plusDays(20).plusYears(20).minusDays(5));

        // 2023-11-20 + 10 days = 2023-12-10
        // 2023-12-10 + 20 years = 2043-12-10
        // 2043-12-10 - 5 days = 2043-12-05


        Period period = timeToChristmas(today);

        System.out.println("timeToChristmas = " + period);

        System.out.println(period.getYears() + " " + period.getMonths() + " " +period.getDays());



    }

    public static Period timeToChristmas(LocalDate today){

        LocalDate christmasEve = LocalDate.of(
                today.getYear()
                ,12
                ,24);

        return Period.between(today,christmasEve);
    }



}
