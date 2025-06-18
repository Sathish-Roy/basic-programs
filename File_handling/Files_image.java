import java.io.*;
public class Files_image {
    public static void main(String []args) throws Exception{
        FileInputStream fis=new FileInputStream("cricket.jpg");
        byte []b=new byte[fis.available()];
        fis.read(b);
        System.out.println("Copying....");
        FileOutputStream fos=new FileOutputStream("C://Users//Sathish Roy//Desktop//summer_intern//Roy//output.jpg");
        fos.write(b);
        System.out.println("Success");
        fis.close();
        fos.close();
    }
}
