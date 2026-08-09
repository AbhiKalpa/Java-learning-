package Methods.Instance_methods;

public class LightBulb {
    boolean ison = false ;

    public void turnOn(){
        ison = true;
        System.out.println("light turned on");
    }

    public void turnOff(){
        ison = false;
        System.out.println("Light turned off");
    }

    public static void main(String[] arags){
        LightBulb obj = new LightBulb();
        System.out.println(".......there is dark here can you light up the room......");
        obj.turnOn();
        System.out.println("thank god lights are back ");

        obj.turnOff();

        System.out.println("oh no what happend to light  ");

    }

}
