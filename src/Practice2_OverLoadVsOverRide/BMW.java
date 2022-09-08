package Practice2_OverLoadVsOverRide;

public class BMW extends Car {
    @Override
    public void color(){
        System.out.println("My car is cool ");

}

  // @Override
    public static void main(String[] args) {
        BMW x6 = new BMW();
        x6.color();



    }
}

