package EdurekaHW.module4;

public class Subclass2 {
    public void divide(int a, int b)
    {
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {   System.out.println("Finally");
        }
    }
    public static void main (String args[])
    {
        Subclass2 s1 = new Subclass2();
        s1.divide(10,0);
    }
}