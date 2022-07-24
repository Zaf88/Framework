import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Scanner {
    public static void main(String[] args) {
        File file = new File("voyna.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);

        Pattern pattern = Pattern.compile(Main.regex);

        for (String line : lines) {
            if (pattern.matcher(line).find()) {
                System.out.println(line);
            }
        }
    }
}
