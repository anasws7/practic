package OOP.Static;

public class Shape {

    public int length ;

    public int side ;

    public int width;

    static double PI  ;
    static double DD ;
    static {
        PI = 3.14;
        DD = 13.2;
    }


    public Shape (int length,int side, int width){
        this.length = length;
        this.side = side;
        this.width = width;
    }













    public int calcArea (){
        return width*side;
    }



    public static void printPI (){
        System.out.println(PI);
    }






}
