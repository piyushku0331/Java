package InputAndOutputFileOperations;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) throws IOException{
        BufferedWriter obj = new BufferedWriter(new FileWriter("second.txt"));
        obj.write("Line 1\nLine 2");
        obj.close();
        BufferedReader obj2 = new BufferedReader(new FileReader("second.txt"));
        String line;
        while((line = obj2.readLine()) != null){
            System.out.println(line);
        }
        obj2.close();
    }
}
