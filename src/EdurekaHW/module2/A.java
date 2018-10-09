package EdurekaHW;

public class A {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3};
        System.out.println(arr[1]);


        int[] iArray = new int[10];
        iArray.length = 15;
        System.out.println(iArray.length);

        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        {
            String kk = "hello";
            double[] marks;
            int length = 100;
            int[] d = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println(d[i]);
                System.out.println(kk.length());
            }
        }

        {
            int arr1[]=new int[]{1,2,3};
            System.out.println(arr1[1]);
        }

        {
            int length = 100, k=0;
            int[] d = new int[length];
            for (int i = 0; i < length; i++)
            System.out.println(k++);
        }
    }
}