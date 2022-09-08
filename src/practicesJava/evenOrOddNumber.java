package practicesJava;

public class evenOrOddNumber {
    public static void main(String[] args) {

        int number = 12345678;

        int Even = 0;
        int odd = 0;


        while(number> 0){
            int each = number % 10;

            if (each%2==0){
                Even++;
            }else{
                odd++;
            }

            number = number/10;

        }

        System.out.println("Even:" +Even);
        System.out.println("Odd:" +odd);
    }
        }
