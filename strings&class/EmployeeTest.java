class Employee{
    int empId;
    String empName;
    double empSalary;
    void setEmpDetails(int eid, String ename, double salary){
        empId=eid;
        empName=ename;
        empSalary=salary;
    }
    void dispEmpDetails(){
        System.out.println("employee Id= "+empId);
        System.out.println("employee name= "+empName);
        System.out.println("employee salary= "+empSalary);
    }
}
public class EmployeeTest {
    public static void main(String[] args){
        Employee e=new Employee();
        e.setEmpDetails(101,"sathish",20000.0);
        e.dispEmpDetails();
        Employee e1=new Employee();
        e1.setEmpDetails(102,"roy",30000.0);
        e1.dispEmpDetails();
    }
}
