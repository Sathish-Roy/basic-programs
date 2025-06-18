interface left{
    void m();
    int x=77;
}
interface right{
    void m();
    int x=88;
}
class test implements left,right{
    public void m(){
        System.out.println("battery is low ");
        System.out.println(left.x);
        System.out.println(right.x);
    }
}
public class javaInterface {
    public static void main(String[] args){
        test t=new test();
        t.m();
    }
}
