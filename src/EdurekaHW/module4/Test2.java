package EdurekaHW.module4;

interface test_int3
{
    int x=20;
}

public class Test2 implements test_int3
{
    int x = 40;
    public static void main (String args[])
    {
        Test2 t1 = new Test2();
        System.out.println(t1.x);
    }
}