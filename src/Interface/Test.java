package Interface;

interface abc{
    void display();
    void show();
}

class xyz implements abc{
    public void display(){
        System.out.println("Hello from display from xyz");
    }
    public void show(){
        System.out.println("Hello form show from xyz");
    }
}

public class Test {
    public static void main(String[] args) {
        abc obj = new abc(){
            public void display(){
                System.out.println("Hello from Display");
            }
            public void show(){
                System.out.println("Hello from show");
            }
        };
        xyz obj2 = new xyz();
        obj.show();
        obj.display();
        obj2.display();
        obj2.show();
    }
}
