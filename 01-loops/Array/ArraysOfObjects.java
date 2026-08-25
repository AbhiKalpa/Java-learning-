package Array;

class Student{
public String name;
public int rollNo;

Student() {
    name = "Abhi";
    rollNo = 94;
}
}

public class ArraysOfObjects{
    public static void main(String[] args){
        Student stud = new Student();
        String Name = stud.name;
        int No = stud.rollNo;
        System.out.println("name is :" +Name+ " roll no is :"+No);

            }
}