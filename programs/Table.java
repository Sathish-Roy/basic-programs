import java.util.Scanner;
/*
public class Table{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number :");
        int n=s.nextInt();
        for(int i=0;i<=20;i++){
            System.out.println(n +" * "+ i +" = " +n*i);
        }
    }
}
*/

public class Table{

    static void printTable(int n){
        for(int i=1;i<=20;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enter the table number you want:");
        int n=s.nextInt();
        //Table obj=new Table();
        //obj.printTable(n);
        printTable(n);
    }
}