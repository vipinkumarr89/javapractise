package EdurekaHW.module1;

class Conversion {
    public static void main(String args[]) {
        double a = 295.04; // 8 byte = 8*8 bits 00000000 00000000 ... 64 times
        int b = 300; // 4 byte = 8*4 bits 00000000 00000000 32 times.
        byte c =  (byte)a; // 1 byte = 8 bits 00000000
        System.out.println("print"+c);
        int d = (byte) b; // 1 byte = 8 bits = -127 to 127
        System.out.println("print"+d);
        System.out.println(c + " " + d);

        // output is not clear
    }
}
