package EdurekaHW.module4;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        int age=0;
        try {
            System.out.println("Enter the age of Candidate");
            Scanner input = new Scanner(System.in);
            age = input.nextInt();
            if( age < 18) {
//                throw new InvalidAgeException();
                throw new InvalidAgeException("this is not the right age for voting");
            }else {
                System.out.println("You are eligible for voting as your age is " + age);
            }
        } catch (InvalidAgeException e){
            System.out.println("Exception is "+e.getMessage());
            System.out.println(e.toString());
//            System.out.println(e.printStackTrace());
            }
    }
}