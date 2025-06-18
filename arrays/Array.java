import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+" values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
//        for(int x:arr){
//            System.out.println(arr[x]);
//        }
        System.out.println("the entered values are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
