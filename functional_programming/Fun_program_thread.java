public class Fun_program_thread {
    public static void main(String []args){
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running: " + i);
            }
        };

        Thread thread = new Thread(task);
        thread.start();

    }
}
