import java.io.*;
public class FIS_example {
    public static void main(String []args) throws Exception{
        FileInputStream fis=new FileInputStream("abc.text");
        //int i=fis.read();
        //System.out.println((char)i);
        /*  int i=0;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        */
        byte []b=new byte[fis.available()];
        fis.read(b);
        /*for(int k=0;k<b.length;k++){
            System.out.print((char)b[k]);
        }
        */
        String s=new String(b);//converting byte array to string
        System.out.print(s);
        fis.close();

    }
}
