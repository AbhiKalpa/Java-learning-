package practice.constructors;

class BankAccount{
    String AccountHolder;
    double Balance ;

    BankAccount(String name, double balance){
        this.AccountHolder = name;
        this.Balance = balance;

        if(balance <0){
            Balance = 0.00;
        }
    }


}


public class SmartSafe {

    public static void main(String args[]){
        BankAccount bankacc = new BankAccount("Abhi",-300.00);

        System.out.println("Welcome to ScamersBank");
        System.out.println("Name of account holder is :"+bankacc.AccountHolder);
        System.out.println("your balance is :"+ bankacc.Balance+ " rupees");
    }
}
