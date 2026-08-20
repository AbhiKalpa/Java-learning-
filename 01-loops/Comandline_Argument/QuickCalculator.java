package Comandline_Argument;

public class QuickCalculator {
    public static void main(String[] args){
        if(args.length ==0 ){
            System.out.println("please enter two nums ");
            return;
        }
       String num1 = args[0];
        String num2 = args[1];

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;

        System.out.println("addition is "+ sum);
    }
}
