package Array.JaggedArray;
import java.util.Scanner;

public class multirow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows you wana print : ");
        int r = sc.nextInt();


        int arr[][] = new int[r][];

        for(int i = 0; i<arr.length; i++){
            arr[i] = new int[i+1];
        }

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
