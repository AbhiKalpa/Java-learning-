package Array;

public class AcessElements {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        System.out.println("the element at position 1: "+array[1]);
        System.out.println("the element at position 1: "+array[2]);
        System.out.println("the element at position 1: "+array[3]);
        System.out.println("the element at position 1: "+array[0]);

        System.out.println("");

        //updating array elements :
        System.out.println("updated elements are :");

        array[0] = 12;
        System.out.println("updated 1st element in array : "+array[0]);
        System.out.println("");

        System.out.println("Traversing array elements 1 by 1: ");

        //traversing array elements 1 by 1 for it we can use using for lopp
        for(int i =0; i<array.length; i++){
            System.out.println("elements in array are :-"+array[i]);
        }
        System.out.println("");
        // find the length of given array
        System.out.println("finding the length of given array");
        int size = array.length;
        System.out.println(size);

        System.out.println("traverse the array using enhanced for loop or for each loop");
        for(int n : array){
            System.out.println(n);
        }
    }
}
