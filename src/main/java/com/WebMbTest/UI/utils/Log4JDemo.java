package com.WebMbTest.UI.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {

    private  static Logger logger = LogManager.getLogger(Log4JDemo.class);


    public static void main(String[] args) {
        logger.trace("trace message");
        logger.info("Info message!");
        logger.debug("Debug message");
        logger.warn("Warn message");
        logger.error("Error message");
        logger.fatal("Fatal message");

    }
}
