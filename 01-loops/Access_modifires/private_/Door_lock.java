package Access_modifires.private_;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


class Try{
 private int pincode = 1234;

 Scanner sc = new Scanner(System.in);

 public int changePin(int oldPin ,int newPin){

     if(oldPin == pincode){
         pincode = newPin;
         System.out.println("new pin is ready");
     }else {
         System.out.println("wrong pin try again");
     }
     return newPin;
 }
}
public class Door_lock{

    public static void main(String [] args){
        Try obj = new Try();
//        System.out.println(obj.pinCode);
        obj.changePin(1234,4322);

    }
}

