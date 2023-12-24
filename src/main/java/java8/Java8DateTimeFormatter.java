package java8;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Ramesh on 026 26.Sep.21.
 */
public class Java8DateTimeFormatter {

    public static void main(String[] args) throws Exception{
        String input = "26.09.2021 17:14";
        String output = new SimpleDateFormat("dd.MM.yyyy").format(new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(input));
        System.out.println("SDF-->  "+output);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(input, dateTimeFormatter);
        System.out.println("localDateTime --->  "+localDateTime);

    }
}
