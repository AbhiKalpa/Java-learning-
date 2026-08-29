package Array.MultidimentionalArray;

public class TwoDimentional {
    public static void main(String[] args){
        //two dimentional array

        int nos[][] = new int[2][3];
        nos[0][0]=10;
        nos[0][1]=20;
        nos[0][2]=30;
        nos[1][0]=10;
        nos[1][1]=20;
        nos[1][2]=30;

        System.out.print(nos[0][0]+" ");
        System.out.print(nos[0][1]+" ");
        System.out.print(nos[0][2]+" ");
        System.out.println();
        System.out.print(nos[1][0]+" ");
        System.out.print(nos[1][1]+" ");
        System.out.print(nos[1][2]+" ");
        System.out.println(nos.length);
    }
}
