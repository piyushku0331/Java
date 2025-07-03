package Interface;

@java.lang.FunctionalInterface
interface ABC{
    void display(String name);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        ABC obj = (name) -> System.out.println("Hello form Display"+name);
        obj.display("Piyush");
    }
}

// lambda function works on functional interface(Interface containing one method)