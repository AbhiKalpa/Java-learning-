package Array;

class Cars{
    String Name ;
    int no ;
    String FlatOwmner;
}

public class CarParking {

    public static void main(String[] arg){
        Cars c1 = new Cars();
        c1.Name = "Alto";
        c1.no = 2456;
        c1.FlatOwmner = "Abhi";

        Cars c2 = new Cars();
        c2.Name = "Scorpio";
        c2.no = 3245;
        c2.FlatOwmner = "Rohan";

        Cars c3 = new Cars();
        c3.Name = "Verna";
        c3.no = 2345;
        c3.FlatOwmner = "Ramu";

        Cars car[] = new Cars[3];
        car[0] = c1;
        car[1] = c2;
        car[2] = c3;

        for(int i =0; i<car.length ; i++){
            System.out.println(car[i].Name+" "+ car[i].no+" "+car[i].FlatOwmner);
        }
    }
}
