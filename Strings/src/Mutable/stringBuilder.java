package Mutable;

public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("Hello");

        StringBuilder sb2 = sb1;

        sb1.append("World");


        if(sb1 == sb2){
            System.out.println("same");
        }else{
            System.out.println("Not-same");
        }

        System.out.println(sb1);
    }
}
