package EdurekaHW.module4;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 100;
        int b = a / 0;
        try {
            System.out.println("output is " + b);
        } catch (Exception e) {
            System.out.println("Divide by Zero" + e);
        } finally {
            System.out.println("Exception handling is complete");
        }
    }
}
