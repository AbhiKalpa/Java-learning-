// Task: Calculate the product of all positive integers up to a number N.

package while_loop;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i=1;
        float mul =1;

        while(n>=1){
           mul = mul*n;
           n--;
        }
        System.out.println(mul);

    }
}
