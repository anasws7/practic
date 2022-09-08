package inheritance;

public class Animal {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;
    public String size;

    public Animal(String name, String breed, char gender, int age, String color, String size) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    public void sleep(){
        System.out.println(name + " is sleeping ");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
