public class Stringbuf {
    public static void main(String[] args){
        StringBuffer s= new StringBuffer("hi hello block");
        System.out.println(s.capacity());
        System.out.println(s.charAt(4));
        s.insert(3,"@$%#^");
        System.out.println(s);
        System.out.println(s.delete(10,13));
        System.out.println(s.append(" evarandi meeru"));
    }
}
