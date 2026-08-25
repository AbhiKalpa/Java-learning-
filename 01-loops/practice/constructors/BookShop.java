package practice.constructors;



class Shop{

    String nameOfBook ;
    double price ;


Shop(){
     nameOfBook = "untitled" ;
     price =0.00 ;

}

Shop(String name, double price){
   this.nameOfBook = name;
   this.price = price;
}

}

public class BookShop {
    public static void main(String[] args){
        System.out.println("constructor without parameters : ");
        Shop order = new Shop();
        System.out.println("Name of book is : "+order.nameOfBook);
        System.out.println("price is : "+order.price);

        System.out.println(" ");

        Shop parametrized = new Shop("Java Basics",29.99);
        System.out.println("Name of book is : "+parametrized.nameOfBook);
        System.out.println("price is ; "+parametrized.price);


    }

}
