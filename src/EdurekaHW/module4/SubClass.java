package EdurekaHW.module4;

class SuperClass {
    public int doIt(String str, int data)throws ArrayIndexOutOfBoundsException{
        String signature = "(String, Integer[])";
        System.out.println(str + "  " + signature);
        return 1;
    }
}

public class SubClass extends SuperClass
{
    public int doIt(String str, int data) throws Exception
    {
        String signature = "test";
        System.out.println("Overridden: " + str + " " + signature);
        return 0;
    }
    public static void main(String args[])
    {
        SuperClass sb = new SubClass();
        try{
            sb.doIt("hello", 3);
        }catch(Exception e){
        }
    }
}