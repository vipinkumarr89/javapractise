package EdurekaHW.module2;

public class Car {
    public String car;

    Car(String car) {
        this.car = car;
    }

    public void Display(){
        System.out.println("Name of the Car is "+this.car);
    }

    public static void main(String[] args) {
        Car obj = new Car("Verna");
        System.out.println(obj.car);
        obj.Display();
    }
}
