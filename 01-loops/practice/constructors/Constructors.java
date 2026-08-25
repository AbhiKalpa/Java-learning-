package practice.constructors;

class CarsInfo{
    String names;
    int year;
    CarsInfo(String names, int year){
        this.names = names;
        this.year = year;
    }
}

public class Constructors{
    public static void main(String [] args){
        System.out.println("welcome to CarsDekho.com 1");

        CarsInfo CI = new CarsInfo("Tesla",2026);

        System.out.println("name of car is: "+CI.names);
        System.out.println("Model of year : "+CI.year);
    }
}