import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Parser {

    final static String pattern = "страдание";

    ArrayList<String> parse(File file) {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        try (Scanner scanner = new Scanner(file).useDelimiter("[^а-€ј-я]+")) {

            String line = "";
            while (scanner.hasNextLine()) {
                lines.add(line);
                line = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            words.addAll(Arrays.asList(line.split("[^а-€ј-я]+")));
        }
        return words;
    }}
