package InputAndOutputFileOperations;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File file = new File("first.txt");
            if(file.createNewFile()){
                System.out.println("File created with name "+file.getName());
            }
            else{
                System.out.println("File created with name");
                System.out.println("File exists "+file.exists());
                System.out.println("Is File "+file.isFile());
                System.out.println("Is Directory "+file.isDirectory());
            }
        }
        catch(IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
