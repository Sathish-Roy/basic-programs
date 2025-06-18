import java.util.Scanner;
public class Break {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("enter the number : ");
            int n=s.nextInt();
            if(n==0)
                break;
            sum+=n;
        }
        System.out.println("the sum of numbers is "+sum);
    }
}
