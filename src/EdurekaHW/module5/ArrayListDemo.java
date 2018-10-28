package EdurekaHW.module5;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Number of Employee in this list are :"+names.size());
        names.add("Vipin");
        names.add("Varun");
        names.add("Arun");
        System.out.println("Number of Employee in this list are :"+names.size());
        for(int index=0;index<names.size();index++) {
            int kk = names.indexOf(index); // Why value of kk is always 1
            System.out.println("Employee with EmployeeId : " + kk + " is " + names.get(index));
        }
    }
}
