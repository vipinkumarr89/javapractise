package EdurekaHW.module4;

//program to divide a number by another number, where the imputs are given as commandline arguments


class Solution {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please provide 2 cmd args");
        }

        catch(NumberFormatException e){
            System.out.println("Please provide numbers as cmd args");
        }
        System.out.println("application completed");

    }

}