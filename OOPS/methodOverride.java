class Over{
    void drink(){
        System.out.println("drink in over class");
    }

}
class load extends Over{
    void drink(){
        System.out.println("drink in load class");
        super.drink();
    }
}
public class methodOverride {
    public static void main(String []args){
        load l=new load();
        l.drink();

    }
}
