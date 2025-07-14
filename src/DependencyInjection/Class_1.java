package DependencyInjection;

class Engine{
    public void start(){
        System.out.println("Engine Start");
    }
}

class Car{
    private Engine engine;

    public Car(Engine engine){
        this.engine =  engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is Driving");
    }
}

public class Class_1 {
    public static void main(String[] args) {
        Engine obj1 = new Engine();
        Car obj = new Car(obj1);
        obj.drive();
    }
}