import java.lang.*;
class CSE extends Thread{

    public void run() {

        for(int i=0;i<3;i++){
            System.out.println("Thread");
            Thread.yield();
//            try {
//                Thread.sleep(3000);
//            }
//            catch(Exception e){
//                System.out.println("Interruption occured");
//            }
        }

    }
}
public class thread_exp{
    public static void main(String []args)throws Exception{
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("roy");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
       // Thread.currentThread().setPriority(10);
        CSE c=new CSE();
        c.start();
        //c.join();
        for(int i=0;i<3;i++){
            System.out.println("main");

        }

    }
}
