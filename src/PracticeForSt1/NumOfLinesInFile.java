package PracticeForSt1;

import java.io.*;

public class NumOfLinesInFile {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("first.txt"));
        String currLine = reader.readLine();
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        while(currLine != null){
            lineCount++;
            String[] words = currLine.split(" ");
            wordCount = wordCount + words.length;
            for(String ch : words){
                charCount = charCount + ch.length();
            }
            currLine = reader.readLine();
        }
        System.out.println("The number of Lines in the file are : "+lineCount);
        System.out.println("The number of words in the file are : "+wordCount);
        System.out.println("The number of characters in the file are : "+charCount);
    }
}
