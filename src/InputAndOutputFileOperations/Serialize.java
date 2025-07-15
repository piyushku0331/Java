package InputAndOutputFileOperations;

import java.io.*;

class Student implements Serializable{
    int id = 101;
    String name = "Sachin";
}

public class Serialize {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("student.obj"));
        obj.writeObject(new Student());
        obj.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.obj"));
        Student s = (Student)in.readObject();
        System.out.println(s.id+" "+s.name);
        in.close();
    }
}
