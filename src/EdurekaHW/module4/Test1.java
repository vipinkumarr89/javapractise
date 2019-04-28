package EdurekaHW.module4;

interface test_int1
{
    int add (int x, int y);
}

interface test_int2 extends test_int1
{
    int add (int x, int y);
}
public class Test1 implements test_int2
{
    public int add(int x, int y)
    {
        return 0;
    }
    public int sub(int a, int b)
    {
        return 0;
    }
    public static void main (String args[])
    {
    }
}