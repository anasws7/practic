package methods;

public class Of {
    public static void main(String[] args) {
        int [] arr= {2,7,9,23,50};
        System.out.println(indexOf(arr,50));

        String []  arr2 = {"hello", "Anas", "Amine", "Khouloud"};
        System.out.println(indexOf(arr2,"hello"));

    }
    public static int indexOf(int [] num, int numbers){
        for(int i = 0; i <num.length; i++ ){
            if(num[i] == numbers){
              return i;
            }
        }
        return -1 ;
    }
    public static int indexOf(String [] str , String element){
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}
