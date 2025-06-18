import java.util.Scanner;
public class ArraySearch {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.print("enter the values : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the element you want : ");
        int key=s.nextInt();
        boolean isFound=false;
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                isFound=true;
            }
            else
                isFound=false;

        }
        if(isFound){
            System.out.println(key+" is found");
        }
        else
            System.out.println(key+" is not found");
    }
}
