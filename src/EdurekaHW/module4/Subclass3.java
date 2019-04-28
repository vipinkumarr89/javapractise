package EdurekaHW.module4;

public class Subclass3 {
    public void divide(int a, int b)
    {
        try
        {
            int c = a / b;
    //throws new Exception ("New exception");
            throw new Exception ("New exception ");

        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");
        }
    }
    public static void main (String args[])
    {
        Subclass3 s1 = new Subclass3();
        s1.divide(10,0);
    }
}