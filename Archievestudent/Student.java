package EdurekaHW.module7.student;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        while (true){
            System.out.println("Choose Option from list");
            System.out.println("1. Create Table");
            System.out.println("2. Insert Sutdent Record");
            System.out.println("3. Delete Student Record");
            System.out.println("4. Update Student Record");
            System.out.println("5. Print Student Record");
            System.out.println("0 to EXIT");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            StudentDB studentDB = new StudentDB();
            if(input == 1){
                studentDB.CreateTable("Student");
                System.out.println("==================================");
            }
            else if(input == 2){
                studentDB.newStudent();
                System.out.println("==================================");
                }
            else if(input ==3){
                studentDB.deleteStudent();
                System.out.println("==================================");
            }
            else if (input == 4){
                studentDB.updateStudentName();
                System.out.println("==================================");
            }
            else if(input == 5){
                studentDB.displayStudent();
                System.out.println("==================================");
            }
            else if (input == 0 ){
                break;
            }else
                System.out.println("Try Again");

        }
    }
}
