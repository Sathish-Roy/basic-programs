import java.io.*;
public class Files_example {
    public static void main(String[] args) throws Exception{
     /*   File f=new File("abc.text");
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isFile());
        System.out.println("the length of the file is = "+f.length());
        */
        /*File f = new File("Roy");
        f.mkdir();
        File f1=new File(f,"exp.text");
        f1.createNewFile();
        */
        File f1=new File("C://Users//Sathish Roy//Desktop//summer_intern//Roy");
        String []s=f1.list();
        System.out.println("the list of files and directories = ");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        int files =0;
        for(int i=0;i<s.length;i++){
            File f=new File(f1,s[i]);
            if(f.isFile()){
                System.out.println(s[i]);
                files++;
            }
        }
        System.out.println("TOtal files = "+files);
    }
}

