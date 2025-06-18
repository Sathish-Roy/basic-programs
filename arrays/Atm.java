import java.util.*;

import static java.lang.System.exit;

public class Atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the amount:");
        int amount = s.nextInt();
        int ch;
        do {
            System.out.println("\n1.deposit\n2.withdraw\n3.display balance\n4.exit");
            System.out.println("enter your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("enter the amount you want ot deposit:");
                    amount += s.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("enter the withdrawl money:");
                    int w = s.nextInt();
                    if (amount > w) {
                        amount -= w;
                    } else {
                        System.out.println("enter valid amount");
                    }
                    break;
                }
                case 3:
                    System.out.println("balance = " + amount);
                    break;
                case 4:
                    exit(0);
            }
        } while (ch != 4);
    }
}
