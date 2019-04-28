package EdurekaHW.module2;

import java.util.*;
public class twoDArray {
    public static void main(String args[]) {
        int i,j;
        double invoice[][] = new double[2][2];  // Initializing array
        Scanner obj = new Scanner(System.in);    // creating a scanner object to take input from user
        for (i = 0; i < 2; i++) {                       // nested for loops
            for (j = 0; j < 2; j++) ;
            {
                System.out.println("Enter the value");
                invoice[i][j] = obj.nextDouble();         // store values to array
                for (i = 0; i < 2; i++) {
                    for (j = 0; j < 2; j++) {
                        System.out.println(invoice[i][j]);
                    }
                }
            }
        }
    }
}