package Annotations;

class aBC{
    @Deprecated
    public void display(){
        System.out.println("Hello from ABC");
    }
}

public class Second {
    @SuppressWarnings({"checked","deprecation"})
    public static void main(String[] args) {
        aBC obj = new aBC();
        obj.display();
    }
}
