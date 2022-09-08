package OOP.encapsulation;

public class UseEmployee {
    public static void main(String[] args) {

        Employee first = new Employee();

        first.setName("Amine");
        first.setSalary(120000);



        System.out.println(first.getName()+ " " + first.getSalary());
    }


}
