import java.util.Scanner;
public class condition_op {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("the maximum num is: "+max);
    }
}
