package setAndGet;

public class Shoes {


    private String brand;
    private double size;


    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size= size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
