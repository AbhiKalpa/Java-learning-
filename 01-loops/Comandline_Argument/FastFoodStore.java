package Comandline_Argument;

public class FastFoodStore {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("your starter is going to be here soon what do you need in main course ");
            return;
        }
        String item_1 = args[0];
        String item_2 = args[1];
        System.out.println("your starter is "+item_1+" and your second dish is "+item_2);
    }
}
