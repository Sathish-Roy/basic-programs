import java.util.Scanner;
import java.lang.*;
public class Throws_example {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two values: ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("the result is = "+a/b);
    }

}
