package Do_while_loop;
import java.util.Scanner;

public class UserMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        int opt ;

        do {

            System.out.println("1. Play Game");
            System.out.println("2. View High Scores");
            System.out.println("3. Exit");

            System.out.println("Enter the option : ");
            opt = sc.nextInt();


            if(opt ==1 || opt==2){
                System.out.println("Loading Game........!");
            } else if (opt ==3) {
                System.out.println("Exit");
            }else{
                System.out.println("invalid option");
            }
            System.out.println();
            System.out.println();

        }while( opt !=3 );
    }

}
