package basic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rk0000 on 6/13/18.
 */
public class SimpleDate {
    public static void main(String[] args) throws Exception{
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").parse("04/04/1989"));  //String to Date
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));  //Date to String
        System.out.println(new Date(System.currentTimeMillis()));  //Time to Date
    }
}
