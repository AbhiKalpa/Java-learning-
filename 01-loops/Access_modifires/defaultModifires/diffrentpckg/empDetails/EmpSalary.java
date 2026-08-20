package Access_modifires.defaultModifires.diffrentpckg.empDetails;

public class EmpSalary {
    int salary = 10000;

    void display(){
        System.out.println("salary is : "+ salary);
    }
}

class letssee{

    public static void main(String[] args){
        EmpSalary em = new EmpSalary();
        em.display();
    }
}
