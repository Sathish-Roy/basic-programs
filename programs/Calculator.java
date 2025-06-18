import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("\n1.addition\n2.subtraction\n3.multiplication\n4.division");
        System.out.println("enter your choice:");
        int ch=s.nextInt();
        int res=0;
        switch(ch){
            case 1 :res=a+b;break;
            case 2 :res=a-b;break;
            case 3 :res=a*b;break;
            case 4 :res=a/b;break;
            default:System.out.println("enter valid choice");
        }
        System.out.println("result = "+res);
    }
}
