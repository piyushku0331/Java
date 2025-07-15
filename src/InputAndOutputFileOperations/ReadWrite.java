package InputAndOutputFileOperations;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public static void main(String[] args) throws Exception {
        FileWriter obj = new FileWriter("first.txt");
        obj.write("Hello World");
        obj.close();
        FileReader obj2 = new FileReader("first.txt");
        int ch;
        while((ch = obj2.read()) != -1){
            System.out.println((char)ch);
        }
    }
}
