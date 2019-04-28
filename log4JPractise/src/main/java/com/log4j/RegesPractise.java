package com.log4j;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegesPractise {
    private static final Logger logger = Logger.getLogger(RegesPractise.class);

    public static void main(String[] args) {
        logger.info("start");
        String string = "This is string testing and this is awesome";
        Pattern pattern = Pattern.compile("[Tt]his");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.toString());
        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();
            System.out.println("start: " + startIndex + " end: " + endIndex + " : "
                    + string.subSequence(startIndex, endIndex));
        }
        logger.info(matcher.find());
    }
}
