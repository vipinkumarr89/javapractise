package EdurekaHW.module4;

public class ArrayIndexOutOfBoundDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};

        try{
            for(int i : array){
                System.out.println("printed Item is "+array[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception is "+e);
        }
        System.out.println("Exception completed !!!");
    }
}
