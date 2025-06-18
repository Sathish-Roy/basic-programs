import java.util.Scanner;
public class SumOfOddAndEven {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int se=0,so=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                se+=i;
            }else{
                so+=i;
            }
        }
        System.out.println("the sum of even numbers is = "+se);
        System.out.println("the sum of odd numbers is = "+so);
    }
}
