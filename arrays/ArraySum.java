import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s.nextInt();
        int []arr=new int[n];
        int sum=0;
        System.out.print("entet the values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.println("the sum of array values is ; "+sum);
    }
}
