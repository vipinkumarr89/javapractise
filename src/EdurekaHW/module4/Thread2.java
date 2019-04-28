package EdurekaHW.module4;
public class Thread2 implements Runnable {
    public void run() {
        try {
            Thread.sleep(0);
            System.out.println("in try block "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
//        System.out.println("run.");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Thread2());
        t.start();
//        t.run();
//      t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("End of method." + Thread.currentThread().getName());
//        t.run();
    }
}
