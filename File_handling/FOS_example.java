import java.io.*;
public class FOS_example {
    public static void main(String []args) throws Exception{
        FileOutputStream fos=new FileOutputStream("abc1.txt");
        String s="Sathish roy studies in rgukt nuzvid";
        byte b[]=s.getBytes();
        fos.write(b);
        FileInputStream fis=new FileInputStream("abc1.txt");
        byte ba[]=new byte[fis.available()];
        fis.read(ba);
        String str=new String(b);
        System.out.println(str);

        /*
        String f=args[0];
        FileInputStream fis=new FileInputStream(f);
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String s=new String(b);
        System.out.println("copying....");
        FileOutputStream fos=new FileOutputStream("C://Users//Sathish Roy//Desktop//summer_intern//Roy//sample.text");
        byte j[]=s.getBytes();
        fos.write(j);
        System.out.println("Successfully copied");
        fos.close();
        fis.close();

         */
    }
}

