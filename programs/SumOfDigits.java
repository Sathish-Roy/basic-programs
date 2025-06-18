import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println("sum of digits = "+sum);
    }
}
