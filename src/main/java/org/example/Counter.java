package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws IOException {
        count(args[0]);
    }

    public static String count(String filename) throws IOException {
        Map<String,Integer> counterWords = new HashMap<>();
        Integer countWord = 0;
        try {
            File myObj = new File(filename);
            FileReader fr=new FileReader(myObj);
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while ((line = br.readLine()) != null) { // count words
                line = line.replaceAll("\\s", " ");
                if (line.isEmpty()) continue;
                else countWord += line.split(" ").length;
                for (int i = 0; i < line.split(" ").length; i++) {
                    String temp = line.split(" ")[i].replaceAll("\\W", "");
                    temp = temp.toLowerCase();
                    if (counterWords.containsKey(temp)) counterWords.put(temp,counterWords.get(temp) + 1);
                    else counterWords.put(temp,1);
                }
            }
            fr.close();
            for (Map.Entry<String,Integer> item : counterWords.entrySet())
                System.out.println("Word = " + item.getKey() +
                        " Appears = " + item.getValue() + "\n");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Words in file: " + countWord + "\n\n");
        return "Words in file: " + countWord + "\n\n";
    }
}