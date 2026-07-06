package com.bridgelabz.searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Linear search class
public class LinearSearchFile {

    //Method to read words
    public static String[] readWords(String filePath) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            StringBuilder sb = new StringBuilder();

            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("[^a-zA-Z ]", "");

                sb.append(line).append(" ");
            }

            br.close();

            return sb.toString().split("\\s+");

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Method to implement linear search
    public static int linearSearch(String[] words, String target) {
        target = target.toLowerCase();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target))
                return i;
        }
        return -1;
    }

    //Main method
    public static void main(String[] args) {
        String filePath = "src/large_text_file.txt";
        String targetWord = "java";

        String[] words = readWords(filePath);

        if (words == null) {
            System.out.println("Unable to read file.");
            return;
        }

        int index = linearSearch(words, targetWord);

        if (index != -1)
            System.out.println("Word \"" + targetWord + "\" found at index " + index);
        else
            System.out.println("Word not found.");
    }
}