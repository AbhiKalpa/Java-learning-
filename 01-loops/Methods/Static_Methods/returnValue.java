package Methods.Static_Methods;

public class returnValue{
    public static int addNumbers( int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void main(String[] args){
        int result = addNumbers(2,3);
        System.out.println(result);
    }
}