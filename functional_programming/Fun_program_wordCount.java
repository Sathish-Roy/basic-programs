import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Fun_program_wordCount {
    public static void main(String []args) throws Exception{
        Map<String,Long> wordCount= Files.lines(Paths.get("abc1.txt"))
                .flatMap(lines-> Arrays.stream(lines.split("\\s+")))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        wordCount.forEach((k,v)->System.out.println(k+" => "+v));

    }
}
