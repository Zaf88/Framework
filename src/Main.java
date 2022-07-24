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
    final static String pattern = "страдание";
    final static String regex = "^[Сс]трада(.*)";

    public static void main(String[] args) throws IOException {


        File f1 = new File("C:\\Users\\user\\IdeaProjects\\Framework\\voyna.txt");
        String[] words;
        String line = "страдание";
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;

        int count = 0;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            for (String word : words) {


                Pattern input = Pattern.compile("страда\\D", Pattern.CASE_INSENSITIVE);
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
    }}




