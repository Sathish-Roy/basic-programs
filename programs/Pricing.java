import java.util.Scanner;
public class Pricing {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter item name:");
        String name=s.next();
        System.out.println("enter the item number , rate and quantity:");
        int no=s.nextInt();
        int rate=s.nextInt();
        int quantity=s.nextInt();
        int amount=rate*quantity;
        double tamount=0;
        if(amount>=1000 && amount<2000)
            tamount=amount*0.9;
        else if (amount>=2000 && amount<3000) {
            tamount=amount*0.85;
        } else if (amount>=3000 && amount<5000) {
            tamount=amount*0.8;
        } else if (amount>5000) {
            tamount=amount*0.75;
        }
        else
            tamount=amount;

        System.out.println("total amount = "+tamount);
    }
}
