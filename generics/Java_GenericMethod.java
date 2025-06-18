public class Java_GenericMethod {
    static <T> void genericDisplay(T obj3){

        System.out.println(obj3.getClass().getName()+" "+obj3);
    }
    public static void main(String []args){
        Java_GenericMethod j=new Java_GenericMethod();
        j.genericDisplay(10);
        j.genericDisplay("Roy");
        j.genericDisplay(77.7);
    }
}
