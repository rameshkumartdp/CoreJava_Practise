package basic;

import org.apache.log4j.Logger;

/**
 * Created by rk0000 on 6/22/18.
 */
public class Log4JDemo {

    static Logger myLogger = Logger.getLogger(Log4JDemo.class);

    public static void main(String[] args) {
        myLogger.info("HEllo Log4J");
    }

}
