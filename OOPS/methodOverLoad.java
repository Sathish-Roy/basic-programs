class overLoad{
    void play(String s){
        System.out.println(s+" is playing");
    }
    void play(){
        System.out.println("No one is playing");
    }
    void play(int i){
        System.out.println(i+" is the jersey number");
    }
}
public class methodOverLoad {
    public static void main(String []args){
        overLoad o=new overLoad();
        o.play();
        o.play("roy");
        o.play(77);
    }
}
