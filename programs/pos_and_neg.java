import java.util.Scanner;
public class pos_and_neg {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        if(n>0){
            System.out.println(n+" is positive");
        }
        else{
            if(n<0){
                System.out.println(n+" is negative");
            }
            else{
                System.out.println(n+" is zero");
            }
        }
    }
}
