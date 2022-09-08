package Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int [] arr = {4, 1, 3, 12, 5};

        int Even = 0;
        int odd = 0;

        for(int i =0 ; i < arr.length;i++){
            if(arr[i] % 2 == 0){
                Even++;
            }else {
                odd++;
            }
        }
        System.out.println(Even);
        System.out.println(odd);
    }
}
