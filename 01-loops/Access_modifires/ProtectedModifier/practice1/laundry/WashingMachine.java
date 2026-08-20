package Access_modifires.ProtectedModifier.practice1.laundry;

import Access_modifires.ProtectedModifier.practice1.device.Appliance;

public class WashingMachine extends Appliance{
    public void startCycle(){
        turnOn();
        System.out.println(brand+" washing machine is running ");
    }
    public static void main(String[] args){
        WashingMachine wm = new WashingMachine();
        wm.startCycle();
    }
}
