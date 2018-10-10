package EdurekaHW.module2;

/*
Question Statement 1
1. Write a program to accept 5 employee IDs and the corresponding names and their salaries
from the user and store them in three arrays.Pass these arrays to a function display() as arguments.
This display() will display the content of the arrays in the following format.

1|a|1
2|b|2
 */

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter the number of employee");
        int number = scanner.nextInt();
        int arrayofEmpId[] = new int[number];
        String[] arrayofEmpName = new String[number];
        int[] arrayofSal = new int[number];
        for (int index = 0; index < number; index++) {
            System.out.println("Enter the EmpID of " + (index+1) + " Employee");
            arrayofEmpId[index] = scanner.nextInt();
            System.out.println("Enter the EmpName of " + (index+1) + " Employee");
            arrayofEmpName[index] = scanner.next();
            System.out.println("Enter the EmpSal of " + (index+1) + " Employee");
            arrayofSal[index] = scanner.nextInt();
        }
        Display( arrayofEmpId, arrayofEmpName, arrayofSal);
        Display( arrayofEmpId, arrayofEmpName);
        System.out.println("Enter the EmpName to Search");
        Scanner scanner1 = new Scanner(System.in);
        String searchEmp = scanner1.next();
        Display(searchEmp, arrayofEmpName,arrayofSal );

    }


        static void Display(int[] array1, String[] array2, int[] array3){
            System.out.println("EmpID|EmpName|EmpSal");
            for(int index=0;index < array1.length;index++){
                        System.out.println(array1[index]+"|"+array2[index]+"|"+array3[index]);
            }
        }


        //Write another function display() withEmployee ID array and Employee name array as arguments.
        // (Note: here we are using concept of function overloading).
        // This function will display the content of the 2 arrays in the followingformat

        static void Display(int[] array1, String[] array2){
            System.out.println("EmpID|EmpName");
            for(int index=0;index < array1.length;index++){
                System.out.println(array1[index]+"|"+array2[index]);
            }
        }

        // Write another function named display() which takes 4 arguments.
        // The arguments are namedas String and 3 arrays (Employee id, name and salary).
        // Function prototype looks like
        // display (String name, int regno[], String Empname[], double salary[]).

        static void Display(String searchEmp, String[] array2, int[] array3) {
            for(int index=0;index < array2.length;index++){
                if(array2[index].equals(searchEmp)) {
                    System.out.println("EmpName|Sal");
                    System.out.println(array2[index] + "|" + array3[index]);
                }
            }
    }
}

/* OUTPUT:

please Enter the number of employee
2
Enter the EmpID of 1 Employee
1
Enter the EmpName of 1 Employee
a
Enter the EmpSal of 1 Employee
1
Enter the EmpID of 2 Employee
2
Enter the EmpName of 2 Employee
b
Enter the EmpSal of 2 Employee
2
EmpID|EmpName|EmpSal
1|a|1
2|b|2
EmpID|EmpName
1|a
2|b
Enter the EmpName to Search
b
EmpName|Sal
b|2

Process finished with exit code 0

 */