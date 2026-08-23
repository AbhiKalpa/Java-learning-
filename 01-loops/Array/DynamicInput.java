package Array;
import java.util.Scanner;
import java.util.Arrays;

public class DynamicInput {


    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size od an array :");
        int size = sc.nextInt();

        int register[] = new int[size];


        for(int i=0; i<register.length; i++){
            System.out.println("Enter the no for i = "+i+"th place");
            register[i]=sc.nextInt();
        }
        System.out.println("your array is "+ Arrays.toString(register));

    }
}
