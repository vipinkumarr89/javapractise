package EdurekaHW.module5;
import java.util.ArrayList;
public class Module5Collection1 {
    public static void main(String[] args) {
        ArrayList<Integer> naturalNumber = new ArrayList<>();
        for(int i=1;i<=10;i++){
            naturalNumber.add(i);
        }
        System.out.println("Number Stored in Arraylist are :"+naturalNumber);
    }
}
