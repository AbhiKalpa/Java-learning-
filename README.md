# Java-learning-
my complete java learning and study material 
there are meany loops 
simply loops are used to execute the code again and again until the given condition satisfy

## ****types of loops****:
##### For loop:

syntax : for(initialization ; limitation ; increment/decriment){
                //code to be executed
                }
The for loop is used when we know the number of iterations (we know how many times we want to repeat a task). The for statement includes the initialization, condition, and increment/decrement in one line.

------------------------------------------------

##### while loop :
Java While Loop NotesA while loop repeats a block of code as long as a specific condition remains true.

##### Key Points :

Pre-tested Loop: The condition is checked before entering the loop body.
Infinite Loop Risk: The loop runs forever if the condition never becomes false.
Variable Update: You must change the loop variable inside the body to eventually stop it.
Zero Iterations: The code inside runs zero times if the initial condition is false.

###### Syntax :
            while (condition){
            // Code block to be executed
            //Increment or decrement statement (update variable)
            }

exercise :-
program prints numbers from 1 to 50.

    import java.util.Scanner;
    public class while_loop.Sum_of_1_to_50 {
    public static void main(String[] args){
    int i=0;
    while(i<=50){
    for(i =0; i<=50 ;i++) {
    System.out.println(i);
    }
    }
    }
    }
--------------------------------------------------------------------------------------Exercise-----------------------------------------------------------------------------------------------------------------------------------------------------------

1) Task: Calculate the product of all positive integers up to a number N.


*********************************************************************************************************************************************************************************************************************************************************************************
##### do-while loop :
A do-while loop in Java is an exit-controlled loop. It executes the code block at least once before evaluating the conditional expression
##### Syntax :
    do {
    // Statements to execute
    // Update expression (e.g., i++)
    } while (condition);

exercise :-

###### Problem 1: User Menu Selection (Most Common Use Case)

Create a program that displays a menu to the user until they choose to exit.
Task: Display options:
    1.Play Game, 
    2.View High Scores, 
    3.Exit.Behavior: 
   If the user enters 1 or 2, print a message like "Loading game..." and show the menu again. 
   If they enter 3, print "Goodbye!" and stop the loop. 
   If they enter anything else, print "Invalid choice, try again" and show the menu again.

Ans :
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

###### Problem 2: Guessing Game with Input Validation

Create a number guessing game that forces the user to enter a valid number.
Task: Fix a secret number (e.g., int secret = 7;). 
Ask the user to guess it.Behavior: Keep asking the user for input until their guess matches the secret number. 
Once they guess correctly, print "You won!".

Ans :
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


###### Problem 3: Accumulating a Total (The Sentinel Value)
Create a program that adds numbers entered by the user until they type 0.
Task: Prompt the user to enter integers.
Behavior: Add each number to a running total. 
Stop the loop immediately when the user enters 0. 
Print the final sum. 
(Hint: A do-while loop is perfect here because you must ask for the number at least once before you can 
check if it is 0).


Ans :
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
    }

    }



