package com.globant.bootcamp.testClasses;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Client {

    static Logger l = Logger.getLogger(Client.class.getName());

    public static void main() {

        BasicConfigurator.configure();

        l.debug("This is debug message");
        l.info("This is info message");
        l.warn("This is warn message");
        l.fatal("This is fatal message");
        l.error("This is error message");

        System.out.println("Your logic executed successfully....");

    }
}