package EdurekaHW.module4;

public class TableOfFiveUsingThread extends Thread{
    public void run(){
        tables( 5);
    }

    private void tables(int Tables){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(Tables+" * "+i+" = "+(Tables*i));
                System.out.println(" Thread " +Thread.currentThread().getName());
                sleep(10);
            }
        } catch (Exception e){
            System.out.println("Exception is "+e);
        }
    }
    public static void main(String[] args) {
        TableOfFiveUsingThread obj = new TableOfFiveUsingThread();
        obj.start();
        for(int i=1;i<=10;i++){
            System.out.println(i+" even number is :"+(i*2));
            System.out.println(" Thread " +Thread.currentThread().getName());
        }
    }
}
