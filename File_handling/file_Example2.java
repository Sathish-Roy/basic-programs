import java.io.*;
import java.lang.*;
public class file_Example2 {
    public static void main(String []args) throws Exception{
        FileInputStream fis=new FileInputStream("output.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        String []str=data.split(" ");
        int word_count=str.length;
        System.out.println("total words = "+word_count);
        int c=0;
        for(int i=0;i<data.length();i++){
            char ch=data.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
        }
        System.out.println("total vowels = "+c);
    }
}
