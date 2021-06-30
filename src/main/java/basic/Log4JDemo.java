package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by rk0000 on 6/22/18.
 */
public class Log4JDemo {

    static Logger myLogger = LoggerFactory.getLogger(Log4JDemo.class.getName());

    public static void main(String[] args) {
        myLogger.info("HEllo Log4J");
    }

}
