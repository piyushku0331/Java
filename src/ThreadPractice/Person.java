package ThreadPractice;

public class Person extends Thread{
    private WaterDispenser dispenser;
    private String name;
    public Person(WaterDispenser dispenser, String name){
        this.dispenser = dispenser;
        this.name = name;
    }
    @Override
    public void run(){
        dispenser.fillWater(name);
    }
}
