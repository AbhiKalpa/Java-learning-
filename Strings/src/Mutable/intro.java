package Mutable;

// topic :- StringBuffer


// there are two ways by which we can make unmute-able strings into mutable strings i.e
//        StringBuffer()
//            StringBuilder();

public class intro {

    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("Hello");

        StringBuffer sb2 = sb1;

        StringBuffer s3 = sb1.append("World");

        if(sb1 == sb2){
            System.out.println("same");
        }else{
            System.out.println("not-same");
        }
//        System.out.println(s3);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
