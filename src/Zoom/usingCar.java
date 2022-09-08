package Zoom;

public class usingCar {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.make = "BMW";
        car1.year = 2021;
        car1.color = "White";
        System.out.println(car1);


        car1.speeding();


        Car car2 = new Car();
        car2.make = "Audi";
        car2.year = 2019;
        car2.color = "Black";
        System.out.println(car2);
        car2.running();




    }







}
