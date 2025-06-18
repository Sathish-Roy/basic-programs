import java.util.Scanner;
import java.lang.Exception;
public class Throw_example {
    public static void main(String []args){
      Scanner s=new Scanner(System.in);
      System.out.println("enter the age : ");
        int age=s.nextInt();
      if (age<18){
          throw new ArithmeticException(" Your not eligible to vote");
      }
      else{
          System.out.println("Your are eligible for vote");
      }
    }
}
