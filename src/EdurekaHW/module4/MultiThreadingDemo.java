package EdurekaHW.module4;

class MultiThreadingDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread.getPriority "+i+" "+Thread.currentThread().getPriority());
            System.out.println(" Thread.getName " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//class MultiThreadingDemo2 implements Runnable{
//        @Override
//        public void run() {
//            for(int i=1;i<=10;i++) {
//                System.out.println("Runnable "+i+" "+Thread.currentThread().getPriority());
//                System.out.println("Runnable "+Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

public class MultiThreadingDemo{
    public static void main(String[] args) throws InterruptedException {

//        Runnable obj2 = new MultiThreadingDemo2();
//        Thread thread = new Thread(obj2);
//        thread.setPriority(Thread.NORM_PRIORITY);
//        thread.start();
        /*this will get finished first */
//        thread.join();

        MultiThreadingDemo1 obj1 = new MultiThreadingDemo1();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main " + i +" "+Thread.currentThread().getPriority());
            System.out.println("Main " + Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
