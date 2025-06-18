import java.lang.String;
public class strings {
    String ss;
    strings(String s){
        ss=s;
    }
    public static void main(String []args){
        String s="cse";
        String s1="cse";
        String s2="CSE";
        System.out.println(s==s1);
        strings a=new strings("cse");
        strings b=new strings("cse");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.ss.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.indexOf("s"));
        System.out.println(s.concat(" student"));
        System.out.println(s);
        System.out.println(s.lastIndexOf("sathish roy"));
        System.out.println(s.substring(1));
        System.out.println(s.length());
        System.out.println(s.replace("s","P"));
    }
}
