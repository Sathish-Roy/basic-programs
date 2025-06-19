import java.util.List;
import java.util.stream.Collectors;

public class Fun_program_realExp {

    public static void main(String []args){
        List<User> users= List.of(
                new User("sathish",true),
                new User("roy",false),
                new User("gogada",true)

        );
        List<String> activeUsers=users.stream()
            .filter(User::isActive)
            .map(User::getName)
            .collect(Collectors.toList());
        System.out.println(activeUsers);
    }
}
class User{
    String name;
    boolean active;

    public User(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
