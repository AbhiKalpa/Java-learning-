package Do_while_loop;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int secritVal =7;
        int input;

        do{
            System.out.println("Guess the number form 1 to 10 :");
            input = sc.nextInt();

            if(input == secritVal){
                System.out.println("congratulations you won");
            } else if (input >10) {
                System.out.println("Number should be in between 1 to 10");
            }else {
                System.out.println("Wrong number try again");
            }
        }while(input !=7);
    }
}
