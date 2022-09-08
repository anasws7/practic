package inheritance;

public class Box {
    double width;
    double length;

    public void setInfo(double width, double length) {
        this.width = width;
        this.length = length;
    }
        @Override
        public String toString () {
            return "Width: " + width + ", Length: " + length;
        }
        }
        class UseBoxes {
            public static void main(String[] args) {
                Box box = new Box();
                box.setInfo(5, 11);
                System.out.print(box);
            }
        }

