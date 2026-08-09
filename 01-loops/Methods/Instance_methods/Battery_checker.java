package Methods.Instance_methods;

public class Battery_checker {
    int battery = 100;
    public void playGame(int minutes){
        battery = battery - minutes;
        System.out.println("played game for "+minutes+" minutes");
    }

    public void showBattery(){
        System.out.println("remaining battery is "+battery);
    }



    public static void main(String[] args){
        System.out.println("system start");

        Battery_checker obj = new Battery_checker();
        obj.playGame(15);
        obj.showBattery();


    }
}