package Array;

class StdInfo{
    String Name;
    int Marks;


}

public class Students {
   public static void main(String[] args){
        StdInfo sti1 = new StdInfo();
        sti1.Name = "Ramdas";
        sti1.Marks = 200;

       StdInfo sti2 = new StdInfo();
       sti2.Name = "Ramnivas";
       sti2.Marks = 210;

       StdInfo sti3 = new StdInfo();
       sti3.Name = "Ramvikas";
       sti3.Marks = 400;

       StdInfo sti4 = new StdInfo();
       sti4.Name = "Rhuldas";
       sti4.Marks = 230;

       StdInfo sti5 = new StdInfo();
       sti5.Name = "Ravidas";
       sti5.Marks = 300;

       StdInfo std[] = new StdInfo[5];
       std[0]=sti1;
       std[1]=sti2;
       std[2]=sti3;
       std[3]=sti4;
       std[4]=sti5;

//       for(int i =0; i<std.length; i++){
//           System.out.println(std[i].Name + " " + std[i].Marks);
//       }

       for(StdInfo stds : std){
           System.out.println(stds.Name+" "+ stds.Marks);
       }

    }
}
