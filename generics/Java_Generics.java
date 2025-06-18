class Test<T > {
    T obj1;

    Test(T obj){
        this.obj1=obj;
    }
    public T print(){
        return obj1;
    }

}
public class Java_Generics {
    public static void main(String []args){
        Test t=new Test(7);
        System.out.println(t.print());
    }
}
