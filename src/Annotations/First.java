package Annotations;

class ABC{
    public void display(){
        System.out.println("Hello form abc");
    }
}
class DEF extends ABC{
    @Override
    public void display(){
        System.out.println("Hello from def");
    }
}

public class First {
    public static void main(String[] args) {
         DEF obj = new DEF();
         obj.display();
    }
}
