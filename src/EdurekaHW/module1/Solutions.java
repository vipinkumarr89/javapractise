package EdurekaHW;

public class Solutions {
    public static void main(String[] args) {

        {
            int number1 = 10, number2 = 20;
            int number3 = 0;
            number3 = number1 + number2;
            System.out.println("Addition of Numbers are " + number3);
            number3 = number2 - number1;
            System.out.println("Subtraction of numbers are" + number3);
            number3 = number1*number2;
            System.out.println("multiplication of numbers are" + number3);
            number3 = number2 / number1;
            System.out.println("Division of numbers are "+number3);
            number3++;
            System.out.println("incremented number is "+number3);
            number3--;
            System.out.println("decremented number is "+number3);
        }


        int age = 18;
        if (age > 18) {
            System.out.println("Candidate is eligible");
        } else
            System.out.println("not Eligible");


        int number = -100;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is negative");
        }

        int a = 10, b = 20;
        if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("b is greater");
        }

        double aa = 21;
        if (aa % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }

        //Write a program to print 10 even numbers and 10 odd numbers
        int anumber = 101;
        int odd_counter = 1;
        int even_counter = 1;
        for (int i = 1; i <= 20; i++) {
            if (anumber % 2 == 0) {
                System.out.println("Even Number " + even_counter + " is " + anumber++);
                even_counter++;
            } else {
                System.out.println("Odd Number " + odd_counter + " is " + anumber++);
                odd_counter++;
            }

        }

        //Write a program to find factorial of a number.
        int factorial = 5;
        int sum=1;
        for(int i=factorial;i>0;i--){
             sum*=i;
        }
        System.out.println("Factorial of "+factorial+" is "+sum);


        //Write a program to generate tables of 10.
        int j = 10;
        for (int i=1;i<=10;i++) {
            System.out.println(j + " * " + j + " = "+(j * i));
        }

        //Write a program to add the digits of a number.

        number = 125;
        int number1 = number;
        sum=0;
        for( ;number > 0;){
            sum+=(number%10);
            number = number/10;
        }
        System.out.println("Sum of Number "+number1+" is "+sum);

        //Write a program to reverse the digits of a number.
        {
            number = 125;
             number1 = number;
            int rev = 0;
            for (; number > 0; ) {
//            int dig = (number%10);
                rev = rev * 10 + number % 10;
                number = number / 10;
            }
            System.out.println("reverse of Number " + number1 + " is " + rev);
        }

        //Write a program to generate 10 Fibonacci numbers.

        {
            double array12[];
            a=0;b=0;
            int c=1,n=10;
            System.out.println("fibonacci series is ");
            for(int i=1;i<=n;i++) {
                a = b;
                b = c;
                c = a+b;
                System.out.print(a+" ");
            }

        }


    }

}
