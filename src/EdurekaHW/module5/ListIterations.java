package EdurekaHW.module5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListIterations {
    public static void main(String[] args) throws Exception {
        List<Integer> data = new ArrayList<>();
//store data into List
        for (int i = 11; i <= 16; i++) {
            data.add(i);
        }
        System.out.println(data);
        System.out.println("<<< 1)iterating on List using get() method");
        for (int i = 0; i < data.size(); i++) {
            Integer n = data.get(i);
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("<<< 2)iterating on List using extended for loop");
        for (Integer n : data) {
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("<<< 3) iterating on List using java.util.Iterator");
        Iterator<Integer> it = data.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("<<< 4) iterating on List using java.util.ListIterator");
        ListIterator<Integer> lit = data.listIterator();
        while (lit.hasNext()) {
            Integer n = lit.next();
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        while (lit.hasPrevious()) {
            Integer n = lit.previous();
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("<<< 5) iterating on List using java.util.Enumeration");
        Enumeration<Integer> en = Collections.enumeration(data);
        while (en.hasMoreElements()) {
            Integer n = en.nextElement();
            System.out.print(n + "\t");
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println(data);
        System.out.println("<<< speciality of java.util.Iterator");
        Iterator<Integer> it1 = data.iterator();
        boolean stat = true;
        while (it1.hasNext()) {
            Integer n = it1.next();
            System.out.print(n + "\t");
            if (stat) {
                it1.remove();
            }
            stat = !stat;
        }
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println(data);
    }
}

