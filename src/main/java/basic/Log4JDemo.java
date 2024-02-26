package basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

/**
 * Created by rk0000 on 6/22/18.
 */
public class Log4JDemo {

    static Logger myLogger = LoggerFactory.getLogger(Log4JDemo.class.getName());
    static java.util.logging.Logger log = java.util.logging.Logger.getLogger("Log4JDemo");

    public static void main(String[] args) {
        myLogger.info("HEllo Log4J");

        log.setLevel(Level.OFF);
        log.info(() -> "Logging with Supplier");  //Argument only constructed if log level shows info messages.

        log.info("Logging without Supplier");   //Argument always constructed
    }

}
