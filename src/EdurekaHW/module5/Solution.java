package EdurekaHW.module5;

//public class Solution { public static void main (String args[])
//{
//    Integer i = 200;
//    int j = 100;
//    j = i;
//    System.out.println(i + j + 200);  }
//}

////////////////////////////////////////////////////////////////////
//class OuterClass {
//    int x = 100;
//    class InnerClass {
//        int y = 200;
//        void display() {
//            System.out.println(x + y);
//        }
//    }
//}
//public class Solution {
//    public static void main (String args[]) {
//        OuterClass o1 = new OuterClass();
//        OuterClass.InnerClass i1 =  o1.new  InnerClass();
//        i1.display();
//    }
//}
////////////////////////////////////////////////////////////////////
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Solution
//{
//    public static void main(String args[]) throws IOException
//    {
//        FileInputStream in = null;
//        int cnt=0;
//        try
//        {
//            in = new FileInputStream("/tmp/input.txt");
//            int c;
//
//            while ((c = in.read()) != -1)
//            {
//                ++cnt;
//            }
//        }
//        finally
//        {
//            if (in != null)
//            {
//                in.close();
//            }
//        }
//        System.out.println(cnt);
//    }
//}
////////////////////////////////////////////////////////////////////

import java.util.*;

//import java.util.*;
//public class Solution
//{
//    public static void main(String args[])
//    {
//        Set set = new TreeSet();
//        set.add(new Integer(2));
//        set.add(new Integer(1));
//        System.out.println(set);
//    }
//}
//////////////////////////////////////////////////////////////////////
//public class Solution {
//    public static Iterator reverse(List list) {
//        Collections.reverse(list);
//return list.iterator();
//}
//    public static void main(String args[])
//    {
//        List list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
////        for (Object obj: Solution.reverse(list))
////            System.out.print(obj + ", ");
//        for (Iterator it = Solution.reverse(list); it.hasNext(); ) {
//            Object obj = it.next();
//            System.out.print(obj + ", ");
//        }
//    }
//}
////////////////////////////////////////////////////////////////////
//import java.util.*;
//public class Solution {
//    public static Iterator reverse(List list)
//{     Collections.reverse(list);
//return list.iterator();
//}
//    public static void main(String args[]) {
//
//        List list = new ArrayList();
//
//        list.add("1"); list.add("2");
//        list.add("3");
//        for (Iterator it = Solution.reverse(list); it.hasNext(); ) {
//            Object obj = it.next();
//            System.out.print(obj + ", ");
//        }
//    }

public class Solution {
    public static void main(String[] args) {
        System.out.println("started");
        PriorityQueue pq = new PriorityQueue();
        pq.add("carrot");
        pq.add("apple");
        pq.add("banana");
        System.out.println(pq.poll() + ":" + pq.peek());

    }
}