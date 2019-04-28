package EdurekaHW.module4;

interface Area {

    public double area(double length, double breadth);
}


class rectangle implements Area{

    @Override
    public double area(double length, double breadth) {
        return length*breadth;
    }

    public static void main(String[] args) {
        rectangle obj = new rectangle();
        System.out.println("Area of rectangle is "+obj.area(4,3));
    }

}
