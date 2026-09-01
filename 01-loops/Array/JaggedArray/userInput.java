package Array.JaggedArray;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int row;
        int colm;

        System.out.println("Enter the no of rows : ");
        row = sc.nextInt();

        System.out.println("Enter the no of columns : ");
        colm = sc.nextInt();

        int arr [][] = new int[row][colm];

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
