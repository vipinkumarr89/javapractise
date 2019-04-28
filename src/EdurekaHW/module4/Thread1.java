package EdurekaHW.module4;

    class Natural extends Thread {
           synchronized public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }

    class Even extends Thread {
       synchronized public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }
    }

    public class Thread1 {
         public static void main(String[] args) throws InterruptedException {
            System.out.println("In "+Thread.currentThread().getName());
            Natural natural = new Natural();
            Even even = new Even();
            natural.setName("Natural");
            even.setName("Even");
            natural.start();
            Thread.sleep(1000);
            even.start();
        }
    }
