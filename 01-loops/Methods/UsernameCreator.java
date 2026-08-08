package Methods;

public class UsernameCreator {
    public static String userName(String first_name, String last_name){
         String name = first_name+"_"+last_name;
         return name;

    }

    public static void main(String[] args){
        System.out.println("Your username is :");
        String result = userName("abhi","ghute");
        System.out.println(result);
    }
}
