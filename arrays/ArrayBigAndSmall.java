import java.util.Scanner;
public class ArrayBigAndSmall {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n=s.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value : ");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
//        for(int i :arr){
//            System.out.print(i+" ");
//        }
        System.out.println("the big value is = "+arr[n-1]);
        System.out.println("the small value is = "+arr[0]);
    }
}
