class ece extends Thread{
    int total=0;
    public void run(){
        synchronized (this){
            for(int i=0;i<3;i++){
                total+=i;
                this.notify();
            }
        }
    }
}
class Thread_Syn{
    public static void main(String []args)throws Exception{
        ece e=new ece();
        e.start();
        synchronized (e){;
            e.wait();
            System.out.println("total is = "+e.total);
        }
    }
}