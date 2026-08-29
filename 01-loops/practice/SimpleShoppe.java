package practice;

class owner{
    String Oname;
    String Pname;

    owner(String Name, String Products){
        this.Oname = Name;
        this.Pname = Products;
    }
}

public class SimpleShoppe {
    public static void main(String[] args){
        owner[] obj = new owner[1];

        obj[0] = new owner("JummaKahn","Motupatlu");

        System.out.println(obj[0].Oname);
        System.out.println(obj[0].Pname);
    }
}
