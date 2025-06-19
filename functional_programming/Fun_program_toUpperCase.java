
import java.nio.file.Files;
import java.nio.file.Paths;;
public class Fun_program_toUpperCase {
    public static void main(String []args) throws Exception{
        Files.lines(Paths.get("sample.txt"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
