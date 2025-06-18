/*
import java.util.Scanner;
import java.lang.Exception;
public class User_Exceptions extends Exception{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("enter the age : ");
            int a = s.nextInt();
            if (a < 18) {
                throw new User_Exceptions();
            }
            System.out.println("entered age is = "+a);
        }
        catch(User_Exceptions e){
            System.out.println("enter valid age");
        }
    }
}
*/
import java.util.Scanner;
import java.lang.Exception;
public class User_Exceptions extends Exception{
    User_Exceptions(String s){
        super(s);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("enter the age : ");
            int a = s.nextInt();
            if (a < 18) {
                throw new User_Exceptions("please enter valid age");
            }
            System.out.println("entered age is = "+a);
        }
        catch(User_Exceptions e){
            System.out.println(e.getMessage());
        }
    }
}

