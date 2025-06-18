import java.lang.Exception;
import java.util.Scanner;
public class try_catch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("enter the values of a and b :  ");
        a = s.nextInt();
        b = s.nextInt();
        int[] ar = {1, 2, 3};
        try {
            System.out.println("result = " + a / b);
            System.out.println("value is = " + ar[8]);
        } catch (ArithmeticException e) {
            System.out.println("error: Division by zero is not possible");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("error: accessing value from out of memory");
        }
        finally{
            System.out.println("code successfully executed");
        }
    }
}
