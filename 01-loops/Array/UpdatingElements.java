package Array;
import java.util.Arrays;

public class UpdatingElements {
    public static void main(String[] args){

        double products[] = {12.50, 3.00, 45.00, 2.50, 100.00};


        for(int i =0; i<products.length ;i++){
            if(products[i] > 5.00){
                products[i] = products[i] *1.10;

            }

        }
        System.out.println("products after gst : "+Arrays.toString(products));
    }
}
