import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        System.out.println("Hello User");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    press:
                    1.insert data
                    2.Retrieve data
                    3.Exit""");
            int n = sc.nextInt();
            switch (n){
                case 1->{
                    System.out.println("please enter the value you want to enter at");
                    int value=sc.nextInt();
                    System.out.println("pleas enter the index to enter at");
                    int index = sc.nextInt();
                    try {
                        insert(value, index, arr);
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("The index position  excceded the max capacity.");
                    }


                }
                case 2->{
                    try {
                        System.out.println("Current data: " + Arrays.toString(arr));
                    }
                    catch (NullPointerException e){
                        System.out.println("The array objects are null .please enter value to print");

                    }
                }
                case 3->{
                    return;
                }
                default -> System.out.println("Invalid input");
            }
        }

    }
    public static void insert (Integer value,Integer index,Integer[] arr) {
        try {
            gapException e1 = new gapException();
            e1.check(arr,index);
        }
        catch (gapException e){
            System.out.println(e);
            return;
        }

        arr[index]=value;

    }
}

class gapException extends Exception{
    gapException(){
        super("There is a null value before the index");
    }

    void check(Integer[] arr, Integer index ) throws gapException{
        if (index > 0 && arr[index - 1] == null) {
                    throw this;
            }

    }

}
