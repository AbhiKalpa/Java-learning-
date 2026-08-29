package Array;
import java.util.Arrays;
class Student{
    // name,rollno,adress,mobileno;

    String name;
    int rollNo;
    String address;
    String mobileNo;


    Student(String StudentName,int RollNo, String Address, String MobileNo){
        this.name = StudentName;
        this.rollNo = RollNo;
        this.address = Address;
        this.mobileNo = MobileNo;

    }
}


public class ArrayOfOBJ {

    public static void main(String[] args){
        Student[] std = new Student[3];

        std[0] = new Student("Abhi",94,"Pune","8459733986");
        std[1] = new Student("Rohan",100,"Latur","9764640745");
        std[2] = new Student("Rahul",97,"Dharashiv","1010101010");


        for(int i =0; i<std.length; i++){
            System.out.println("name : " +std[i].name +" RollNo: " + std[i].rollNo + " Address : "+std[i].address + "MobileNo : "+std[i].mobileNo );
            System.out.println(" ");
        }
    }


}
