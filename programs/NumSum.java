import java.util.Scanner;
public class NumSum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
        int i=0;
        while(i<10){
            System.out.println("enter the number "+(i+1)+" : ");
            int n=s.nextInt();
            sum+=n;
            i++;
        }
        System.out.println("sum = "+sum);
    }
}
