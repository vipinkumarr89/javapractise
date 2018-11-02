package EdurekaHW.module5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Module5Collection2 {
    public static void main(String[] args) {
        HashMap names = new HashMap();
        names.put(1,"vipin");
        names.put(2,"varun");
        names.put(3,"arun");

        //Get an iterator
        Iterator iterator = names.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
