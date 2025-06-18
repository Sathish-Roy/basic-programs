
class Employe{
    int empId;
    String empName;
    double empSalary;
    void setEmpDetails(int empId, String empName, double empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }
    void dispEmpDetails(){
        System.out.println("employee Id= "+empId);
        System.out.println("employee name= "+empName);
        System.out.println("employee salary= "+empSalary);
    }
}
public class This {
    public static void main(String[] args){
        Employe e=new Employe();
        e.setEmpDetails(101,"sathish",20000.0);
        e.dispEmpDetails();
        Employe e1=new Employe();
        e1.setEmpDetails(102,"roy",30000.0);
        e1.dispEmpDetails();
    }
}

