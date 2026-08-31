package Array.MultidimentionalArray;

public class DirectArray {
    public static void main(String[] arg){
        int arr[][]={{1,2,3},{1,2,3}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println(" ");
        }
    }
}
