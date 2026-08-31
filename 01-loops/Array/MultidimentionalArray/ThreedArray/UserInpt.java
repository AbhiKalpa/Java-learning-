package Array.MultidimentionalArray.ThreedArray;
import java.util.Scanner;


public class UserInpt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int layer;
        int row;
        int colum;

        int i=0;
        int j=0;
        int k=0;


        System.out.println("Enter the num of layers : ");
        layer = sc.nextInt();
        System.out.println("Enter the no of Rows : ");
        row = sc.nextInt();
        System.out.println("Enter the no of Columns : ");
        colum = sc.nextInt();


        int arr[][][] = new int[layer][row][colum];

        int m = arr.length;
        int n = arr[i].length;
        int o = arr[i][j].length;

        for(i = 0; i<m; i++){
            for(j=0 ; j<n; j++){
                for(k=0; k<o; k++){
                    System.out.println("Enter the value for "+"arr["+i+"]"+"["+j+"]["+k+"]");
                    arr[i][j][k] = sc.nextInt();

                }
            }
        }

        for(i =0; i<m; i++){
            for(j =0; j<n; j++){
                for(k=0; k<o; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        }



    }
}
