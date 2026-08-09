package Methods.Instance_methods;

public class Athlete {

    int distanceCovered = 0;


    public void run(){
        distanceCovered = distanceCovered+10;
        System.out.println(distanceCovered);

    }

    public void showDistance(String athleteName){
        System.out.println(athleteName + " ran"+ distanceCovered +"KM");


    }

    public static void main(String[] args){
        Athlete obj = new Athlete();
        obj.run();
        obj.showDistance("sachine");
    }
}
