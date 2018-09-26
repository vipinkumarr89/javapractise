package com.vipin.PlymorphismTuto;

 class Car {
    private boolean engine;
    private int Cylinder;
    private String name;
    private int Wheels;



    public Car(int cylinder, String name) {
        this.engine = true;
        this.Cylinder = cylinder;
        this.name = name;
        this.Wheels = 4;
    }

    public int getCylinder() {
        return Cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Engine has started";
    }

    public String accelerate(){
        return "Engine has accelerated";
    }

    public String brake(){
        return "Brake has beeen applied";
    }

}

class Honda extends Car{
    public Honda(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Honda started";
    }

    @Override
    public String accelerate(){
        return "honda accelerate";
    }

    @Override
    public String brake() {
        return "Honda stopped";
    }
}

public class Main{

public static void main(String[]args){
        Car car=new Car(4,"Jeep");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda honda=new Honda(4,"Honda");
        honda.startEngine();
        honda.accelerate();
        honda.brake();
        }
}
