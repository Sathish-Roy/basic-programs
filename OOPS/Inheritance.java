class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void drinks(){
        System.out.println("Dog drinks milk");
    }
}
class Puppy extends Dog{
    void sleep(){
        System.out.println("Puppy is sleeping");
    }
}
class Cat extends Animal{
    void walk(){
        System.out.println("cat is walking");
    }
}
public class Inheritance {
    public static void main(String []args){
        Puppy p=new Puppy();
        p.eat();
        p.sleep();
        p.drinks();
        Cat c=new Cat();
        c.walk();
        c.eat();
    }
}
