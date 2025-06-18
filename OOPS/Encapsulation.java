class Student{
    private int rollno;
    private String name;

    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String []args){
        Student s=new Student();
        s.setRollno(7);
        s.setName("Roy");
        System.out.println(s.getRollno());
        System.out.println(s.getName());
    }
}
