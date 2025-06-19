import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional_exp1 {
    static List<Employees> emp=new ArrayList<>();
    static{
        emp.add(
                new Employees("A","B",100,List.of("P1","P2"))
        );
        emp.add(
                new Employees("C","D",200,List.of("P1","P3"))
        );
        emp.add(
                new Employees("A","B",300,List.of("P3","P4"))
        );
    }
    public static void main(String []args){
        emp.stream().forEach(e->System.out.println(e));
        List <Employees> s=emp.stream().map(e->new Employees (e.getFname(),e.getLname(),
               e.getSalary()*10,e.getProjects())).collect(Collectors.toList());
        System.out.println(s);


        emp.stream().filter(e->e.getSalary()>200)
                .forEach(e->System.out.println(e));

        String projects = emp.stream().map(e->e.getProjects()).
                flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
        System.out.println(projects);

        List<Employees> e=emp.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(e);
        Stream.generate(Math::random).limit(5).forEach(v->System.out.println(v));



    }
}


class Employees{
    private String Fname;
    private String Lname;
    private double salary;
    private List<String> projects;

    @Override
    public String toString() {
        return "Employees{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public Employees() {
    }

    public Employees(String fname, String lname, double salary, List<String> projects) {
        Fname = fname;
        Lname = lname;
        this.salary = salary;
        this.projects = projects;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }
}
