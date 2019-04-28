package EdurekaHW.module4;

import java.io.IOException;

public class ExceptionHandlingDemo {

//    public static void main(String[] args) {
//
//        ExceptionHandlingDemo exceptionHandlingDemo = new ExceptionHandlingDemo();
//        exceptionHandlingDemo.exception();
//    }

        public void exception () throws IOException {
            try {
                int a = 100;
                int b = a / 0;
                System.out.println("output is " + b);
            } catch (ArithmeticException e) {
                System.out.println("Divide by Zero " + e);
            } finally {
                System.out.println("Exception handling is complete");
            }

        }

}
