package EdurekaHW.module1;

class Conversion {
    public static void main(String args[]) {
        double a = 295.04;
        int b = 300;
        byte c =  (byte)a;
        System.out.println(a % 127); // output is 41.04000000002
        System.out.println(c); // output is 39
        int d = (byte) b;
        System.out.println(b % 127); // output is 46
        System.out.println(d); // output is 44
    }

}

/* output :
41.04000000000002
 convert value of a is 39
46
converted value of b is 44
 */