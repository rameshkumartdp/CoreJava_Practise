import java.time.*;

public class Java8DateTime {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        System.out.println("--------------------------------");

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println("--------------------------------");

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println(localDateTime.toString());

        System.out.println(localDateTime.plusDays(100));
        System.out.println(localDateTime.plusMonths(2));

        System.out.println(localDateTime.minusMonths(11));

        System.out.println(localDateTime.plus(Period.of(1, 2, 3)));

        System.out.println(localDateTime.withYear(2014).withMonth(8).withDayOfMonth(8));
    }
}
