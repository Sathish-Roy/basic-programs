import java.util.Scanner;
public class BigThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is big");
        } else {
            if (b > c) {
                System.out.println(b + " is big");
            } else {
                System.out.println(c + " is big");
            }
        }
    }
}
