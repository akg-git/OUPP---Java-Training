package gov.in.oupp.training.java.corejava.log4j.example2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample2 {
    private static final Logger logger = LogManager.getLogger(Log4jExample2.class);

    public static void main(String[] args) {
        logger.info("this is a logger information message");
        logger.error("this is a logger error message");
        logger.fatal("this is a logger fatal message");
        logger.warn("this is a logger warning message");
    }
}
