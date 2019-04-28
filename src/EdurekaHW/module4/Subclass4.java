package EdurekaHW.module4;

public class Subclass4 {
    public void divide(int a, int b)throws ArithmeticException
    {
        try
        {
            if (b == 0)
                throw new  Exception ("New exception");
            int c = a /b;
            System.out.println("Result is "+ c);
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("ArrayIndexOutOfBoundsException ");
        }  catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");
        }
    }
    public static void main (String args[])
    {
        try  {
            Subclass4 s1 = new Subclass4();
          //  s1.divide(10,1);
           s1.divide(10,0);
        }  catch(ArithmeticException ex)
        {   System.out.print("ArithmeticException " + ex);
        }
    }
}