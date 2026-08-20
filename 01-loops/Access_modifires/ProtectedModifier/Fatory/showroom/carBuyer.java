package Access_modifires.ProtectedModifier.Fatory.showroom;
import Access_modifires.ProtectedModifier.Fatory.parts.Engine;



public class carBuyer extends Engine {
    public void see(){

        System.out.println("The engine type is ");
        engineType();
    }
    public static void main(String[] arg){
        carBuyer cb = new carBuyer();
        cb.see();


    }
}
