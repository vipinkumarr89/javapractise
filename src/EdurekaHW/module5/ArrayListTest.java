package EdurekaHW.module5;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("No of Participants = " + names.size());
        names.add("Abhishek");
        names.add("Amit");
        names.add("Aqeel");
        names.add("Deepak");
        names.add("Amit");
        System.out.println(names + " | Size = " + names.size());
        names.add(1, "Kamala");
        System.out.println(names + " | Size = " + names.size());
        names.set(3, " Kundavi");
        System.out.println(names + " | Size = " + names.size());
        System.out.println("Person @ position 1 = " + names.get(0));
        System.out.println("Index of Amit = " + names.indexOf("Amit"));
        System.out.println("Last Index of Amit = " + names.lastIndexOf
                ("Amit"));
        System.out.println(names.remove(2));
        System.out.println(names.remove("Amit"));
        System.out.println(names.remove("Amit"));
        System.out.println(names + " | Size = " + names.size());
    }
}

