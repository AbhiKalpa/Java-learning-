package Array;

public class PrimitiveArray {
    public static void main(String[] args){
        System.out.println("array of primitive data-type");

        int i;

        int prim[] = {1,2,3,4,5};
        for(i= 0; i<prim.length; i++){
            System.out.print(prim[i]+" ");
        }
        System.out.println();
        String names[] ={"Abhi","Rushi","rahul"};
        for(i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }
    }
}