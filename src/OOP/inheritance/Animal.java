package OOP.inheritance;

public class Animal {
    public String name;
    public String breed;
    public int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void Sleep(){
        System.out.println("i am sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
