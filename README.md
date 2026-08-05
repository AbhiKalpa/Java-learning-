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
