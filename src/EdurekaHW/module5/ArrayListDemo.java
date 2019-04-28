package EdurekaHW.module5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Number of Employee in this list are :"+names.size());
        names.add("Vipin");
        names.add("Varun");
        names.add("Arun");

        List <String> nameslist = names.subList(names.size()-2, names.size());
        for (String string : nameslist){
            System.out.println(string);
        }
//        System.out.println("Number of Employee in this list are :"+names.size());
//        for(int index=0;index<names.size();index++) {
//            System.out.println("Employee with EmployeeId : " + (index+1) + " is " + names.get(index));
//           }

        //// Use Iterator to set loop on ArrayList

//        Iterator<String> iterator = names.iterator();
//            while(iterator.hasNext()){
//                String emp = iterator.next();
////                Character emp = iterator.next();
//                System.out.println(emp);
//            }
    }
}
