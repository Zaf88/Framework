import java.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(1*i);
            System.out.println();

            int b = 0;
            for (int i1 = 2; i <= 10; i++) {
                System.out.println(2*i);
                System.out.println();

                int c = 0;
                for (int i2 = 3; i <= 10; i++) {
                    System.out.println(3*i);
                }
                File f1=new File("voyna.txt");
                String[] words=null;
                FileReader fr = new FileReader(f1);
                BufferedReader br = new BufferedReader(fr);
                String s;
                String input="���������";
                int count=0;
                while((s=br.readLine())!=null)
                {
                    words=s.split(" ");
                    for (String word : words)
                    {
                        if (word.equals(input))
                        {
                            count++;
                        }
                    }
                }
                if(count!=0)
                {
                    System.out.println("The given word is present for "+count+ " Times in the file");
                }
                else
                {
                    System.out.println("The given word is not present in the file");
                }

                fr.close();
            }}}}