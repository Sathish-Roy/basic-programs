import java.io.*;
public class File_writer_reader {
    public static void main(String []args) throws Exception{
        File f=new File("java.txt");
        FileWriter fw=new FileWriter(f);
        fw.write("India is my country .I love my country");
        fw.close();
        System.out.println("written succesfully");
        FileReader fr=new FileReader(f);
        char []ch=new char[(int)f.length()];
        fr.read(ch);
        for(int i=0;i <ch.length;i++){
            System.out.print((char)ch[i]);
        }
    }
}
