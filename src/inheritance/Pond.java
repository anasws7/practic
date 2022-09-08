package inheritance;

public class Pond {
    Water water;

    /*line
    5*/ public Pond(String color){
        water = new Water(color);
    }
}
        class Water {
            String color;

            public Water(String color) {
                this.color = color;
            }
        }
