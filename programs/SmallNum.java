import java.util.Scanner;
public class SmallNum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number 1 : ");
        int min=s.nextInt();
        for(int i=1;i<10;i++){
            System.out.print("enter the number "+(i+1)+" : ");
            int n=s.nextInt();
            if(n<min)
                min=n;
        }
        System.out.println("the min number is = "+min);
    }
}
