package com.log4j;
import org.apache.log4j.Logger;
import java.util.ArrayList;

public class FirstLog4j {
    private static final Logger logger = Logger.getLogger(FirstLog4j.class);

    public static void main(String[] args) {
        logger.info("Start of setUp");

        ArrayList<String> list = new ArrayList <>();

        list.add("varun");
        list.add("vipin");

        for (String string: list){
//            System.out.println(string);
            logger.info(string);
        }
        logger.trace("Hello this is an debug message");
        Integer i1 = new Integer(3);
//        System.out.println(i1);
        logger.trace(i1);
        Object i2 = null;
        logger.error(i2);
    }
}
