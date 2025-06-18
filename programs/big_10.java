import java.util.Scanner;
public class big_10 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int i=0;
        int max=0;
        while(i<10){
            System.out.println("enter number "+(i+1)+" :");
            int n=s.nextInt();
            if(n>max){
                max=n;
            }i++;
        }
        System.out.println("the max value is : "+max);
    }
}
