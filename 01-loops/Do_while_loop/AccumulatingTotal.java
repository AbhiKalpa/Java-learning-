package Do_while_loop;
import java.util.Scanner;

public class AccumulatingTotal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0;

        do{
            System.out.println("Enter the number :");
            input = sc.nextInt();

            sum = sum + input;

        }while( input !=0 );
        System.out.println("the total sum " + sum);
        sc.close();
    }

}
