package Methods.Static_Methods;

public class TheMultiplier {
    public static int multipier(int a , int b){
        int multiply = a * b;
        return multiply;
    }
    public static void main(String[] args){
        System.out.println("multiplication is ");
        int result =multipier(6,8);
        System.out.println(result);
    }
}