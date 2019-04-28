package EdurekaHW.module4;

public class Circle implements Runnable{

    public void run(){
        System.out.println("Inside implemented Runnable");

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.run();
    }
}
