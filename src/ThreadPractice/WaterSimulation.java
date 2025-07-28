package ThreadPractice;

public class WaterSimulation {
    public static void main(String[] args)  throws InterruptedException {
        WaterDispenser dispenser = new WaterDispenser();
        Person[] persons = {
                new Person(dispenser, "[Office A - Person 1]"),
                new Person(dispenser, "[Office B - Person 1]"),
                new Person(dispenser, "[Office A - Person 2]"),
                new Person(dispenser, "[Office B - Person 2]")
        };
        for(Person p : persons){
            p.start();
        }
        for(Person p : persons){
            p.join();
        }
        System.out.println("All Persons have filled water");
    }
}
