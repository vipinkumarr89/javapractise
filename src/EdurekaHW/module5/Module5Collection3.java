package EdurekaHW.module5;
import java.util.*;
public class Module5Collection3 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        //Adding Element
        hashtable.put("vipin",90);
        hashtable.put("varun",20);
        hashtable.put("arun",34);
//        System.out.println(hashtable.values());
//        System.out.println(hashtable.keys());

        // Iteration using enumeration
//        Enumeration enumeration = hashtable.keys();

        // Display using while loop
        Collection values = hashtable.values();
//        Integer maxValue = Collections.max(values);
        Comparable maxValue = Collections.max(values);
        Enumeration keys = hashtable.keys();
        while(keys.hasMoreElements()){
            Object key = keys.nextElement();
            if((hashtable.get(key)).equals(maxValue))
                System.out.println("Student "+key+" has highest mark :"+maxValue);
        }

    }
}
