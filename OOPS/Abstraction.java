abstract class animal{
    abstract void sound();
}
class dog extends animal{
    public void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    public void sound(){
        System.out.println("cat meow");
    }

}
public class Abstraction {
    public static void main(String []args){
        animal a;
        a=new cat();
        dog d=new dog();
        a.sound();
        d.sound();
        a=d;
        a.sound();
    }
}
