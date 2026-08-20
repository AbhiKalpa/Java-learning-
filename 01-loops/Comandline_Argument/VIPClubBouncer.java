package Comandline_Argument;

public class VIPClubBouncer {

    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("please enter valid inputs ");
            return;
        }
        String name = args[0];
        String arg2 = args[1];

        int age = Integer.parseInt(arg2);

        if(age <= 18){
            System.out.println("sory "+name+" your age is not matching to the adults criteria ");
        }else{
            System.out.println(name + " welcome to the club");
        }

    }
}
