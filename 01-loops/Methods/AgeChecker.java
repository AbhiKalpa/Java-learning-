package Methods;

public class AgeChecker {
    public static boolean agecheck(int age){

        boolean eligible = age >=18;
        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can not vote");
        }
        return eligible;
    }

    public static void main(String[] args){
        boolean result = agecheck(19);
        boolean result1 = agecheck(17);
    }

}
