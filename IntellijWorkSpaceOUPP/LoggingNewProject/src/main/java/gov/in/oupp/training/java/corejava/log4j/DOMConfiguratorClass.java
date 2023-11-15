package gov.in.oupp.training.java.corejava.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class DOMConfiguratorClass {
    static Logger logger = Logger.getLogger(DOMConfiguratorClass.class);

    public static void main(String[] args) {
        DOMConfigurator.configure("src/main/resources/log4j.xml");
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
    }

}


