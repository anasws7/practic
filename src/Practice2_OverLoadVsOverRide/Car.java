package Practice2_OverLoadVsOverRide;

public class Car {
    public static void speed(){
        System.out.println("car is speeding 130 MPH");
    }
    public static String  speed(String ww ){
        System.out.println("speed went down to 80 " + ww);
        return ww;
    }
    public static boolean speed (int yes ){
        System.out.println("car is driving !! ");
        //int name ;
        return true ;
    }

    public static void main(String[] args) {
        speed();
        speed(120);
        speed("speed");

    }
    public void color(){
        System.out.println("Black");
    }


}
