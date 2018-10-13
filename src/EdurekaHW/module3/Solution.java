package EdurekaHW.module3;

//public class Solution {
//
//    int Account_number;
//    String Account_Name;
//
//    public static void main(String args[]) {
//        Solution t1 = new Solution();
////        Solution t1 = null;
//        t1.Account_number = 100;
//        t1.Account_Name = "Pearl";
//        System.out.println("Id " + t1.Account_number);
//        System.out.println("Name " + t1.Account_Name);
//    }
//}

//////////////////////////////////////////////////////////////

//class test133 {
//    int Account_number; String Account_Name;
//    test133 (int x)
//    {
//        Account_number = x;
//    }
//}
//
//public class Solution {
//    public static void main (String args[])
//    {
//        test133 t1 = new test133(150);
//        t1.Account_Name = "Banking";
//        System.out.println("Id " + t1.Account_number);
//        System.out.println("Name " + t1.Account_Name);
//    }
//}

//////////////////////////////////////////////////////////////

class base
{
    base()
    {  System.out.println("In the base class..");
        test();
    }

    void test()
    {  System.out.println("in the test function...");
//        base b1 = new base();
    }
}
public class Solution
{
    public static void main (String args[])
    {
        base b1 = new base();
    }
}