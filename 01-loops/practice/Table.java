package practice;
import java.util.Scanner;

public class Table {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the value : ");
        int val = sc.nextInt();

        for(int i=1; i<=10; i++ ){

            System.out.println(val + " * " + i + "=" + " "+val*i );
        }
        }

}
