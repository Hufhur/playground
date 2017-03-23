package chapter5;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by M60095A on 22-3-2017.
 */
public class DateTimeDemo {

    public static void main(String[] args) {
        Instant runtimeStart = Instant.now();

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getChronology());

        System.out.println(ZonedDateTime.now());

        //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        ZoneId zoneHome = ZoneId.systemDefault();
        ZonedDateTime home = ZonedDateTime.of(LocalDateTime.now(), zoneHome);
        System.out.println(home);

        ZoneId zoneUS = ZoneId.of("US/Eastern");
        ZonedDateTime us = ZonedDateTime.of(LocalDateTime.now(),zoneUS);

        ZoneId zoneVatican = ZoneId.of("Europe/Vatican");
        ZonedDateTime eur = ZonedDateTime.of(LocalDateTime.now(),zoneVatican);

        ZonedDateTime start = null;
        ZonedDateTime end = null;

        start = us.isBefore(eur) ? us : eur;
        end = us.isAfter(eur) ? us : eur;
        Integer minutes = 0;
        Duration duration = Duration.ofMinutes(5);

        System.out.println(ChronoUnit.MINUTES.between(start, end));

        while(start.isBefore(end)){
            start = start.plus(duration);// .plusMinutes(1);
            minutes++;
        }

        System.out.println(duration + " betweeen US and Eur: " + minutes);

        Instant runtimeEnd = Instant.now();

        System.out.println("Runtime: " + ChronoUnit.MILLIS.between(runtimeStart, runtimeEnd));
    }
}
