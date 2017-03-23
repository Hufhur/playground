package chapter5;

import java.time.*;

/**
 * Created by M60095A on 22-3-2017.
 */
public class DayTimeSaving {

    public static void main(String[] args) {
        System.out.println("Zomertijd");
        process(LocalDate.of(2017,3,26));

        System.out.println("Wintertijd");
        process(LocalDate.of(2017,10,29));

        StringBuilder sb = new StringBuilder();


    }

    private static void process(LocalDate date){
        LocalTime time = LocalTime.of(2,59,50);
        ZonedDateTime endTime = ZonedDateTime.of(date, time, ZoneId.systemDefault()).plusSeconds(20);

        ZonedDateTime dateTime = ZonedDateTime.of(date, time, ZoneId.systemDefault());

        while(dateTime.isBefore(endTime)){
            dateTime = dateTime.plusSeconds(1);
            System.out.println(dateTime);
        }

    }
}