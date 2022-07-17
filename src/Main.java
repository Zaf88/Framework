import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    final static String pattern = "���������";
    final static String regex = "^[��]�����(.*)";

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) * (j + 1));


                File f1 = new File("C:\\Users\\user\\IdeaProjects\\Framework\\voyna.txt");
                String[] words;
                String line = "���������";
                FileReader fr = new FileReader(f1);
                BufferedReader br = new BufferedReader(fr);
                String s;

                int count = 0;
                while ((s = br.readLine()) != null) {
                    words = s.split(" ");
                    for (String word : words) {


                        Pattern input = Pattern.compile("������\\D", Pattern.CASE_INSENSITIVE);
                        Matcher mc = input.matcher(word);
                        while (mc.find())
                            count++;
                    }
                }

                if (count != 0) {
                    System.out.println("The word is present" + count + "times in the file");
                } else {
                    System.out.println("The word is not  present in the file");
                }
                fr.close();
            }
                File file = new File("voyna.txt");
                Parser parser = new Parser();
                ArrayList<String> lines = parser.parse(file);

                Pattern pattern = Pattern.compile(regex);

                for (String line : lines) {
                    if (pattern.matcher(line).find()) {
                        System.out.println(line);
                    }
                }
            }
    }

