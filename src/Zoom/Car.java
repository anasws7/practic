package Zoom;

public class Car {

    public String make;
    public String color;
    public int year ;



    public void speeding (){
        System.out.println(make + " is Speeding ");
    }

    public void running (){
        System.out.println(make + " is running ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
