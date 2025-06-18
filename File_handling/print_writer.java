
import java.io.*;
public class print_writer {
    public static void main(String []args) throws Exception{
        File f=new File("print.txt");
        f.createNewFile();
        PrintWriter pw=new PrintWriter(f);
        pw.print("I love my country");
        pw.print(10.1);
        pw.print('s');
        pw.flush();
        pw.close();
        System.out.println("written succesfully");
    }
}
