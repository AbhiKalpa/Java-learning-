package Access_modifires.private_;

class smartCar{
    private int speed = 0;

    public void accelerate(int increase){
        speed = speed+increase;

        if(speed >=120){
            System.out.println("speed limet crossed");
            System.out.println("decreasing speed limit....");
            speed = 120;
            System.out.println("Speed limit reached! Capped at 120 km/h.");
        } else {
            System.out.println(speed);
        }
        }
    public void displaySpeed(){
        System.out.println("Current speed : "+speed);
    }
}


public class Speed_controller {
    public static void main(String[] arg){
    smartCar sc = new smartCar();
    sc.accelerate(190);
    sc.displaySpeed();

    }
}
