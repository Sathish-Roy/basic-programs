import java.io.*;
public class Buf_reader {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("sample.txt");
        BufferedReader br=new BufferedReader(fr);
        /*
        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
         */
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        fr.close();
        br.close();
    }
}
