package Array;
class details{
    String Name;
    int rollno;
    double marks;



}


public class Schoolers {

    public static void main(String[] args){
        details info = new details();
        info.Name = "Abhi";
        info.rollno = 94;
        info.marks = 48.22;


        details info1 = new details();
        info1.Name = "Rohan";
        info1.rollno = 95;
        info1.marks = 88.75;


        details info2 = new details();
        info2.Name = "Akshy";
        info2.rollno = 93;
        info2.marks = 89.46;


        details display[] = new details[3];
        display[0] = info;
        display[1] = info1;
        display[2] = info2;


    for(int i = 0; i<display.length; i++){

        if(display[i].marks>=75.00){
            System.out.println(display[i].Name+" "+ display[i].rollno+" "+ display[i].marks);
        }

    }

    }

}
