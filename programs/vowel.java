import java.util.Scanner;
public class vowel {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the character");
        char ch =s.next().toLowerCase().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println(ch+" is vowel");break;
            default:
                if(Character.isLetter(ch)){
                    System.out.println(ch+" is a consonent");
                }else{
                    System.out.println(ch+" is not an alphabet");
                }
        }
    }
}
