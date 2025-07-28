package ThreadPractice;

public class WaterDispenser {
    private boolean isFull = false;
    public synchronized void fillWater(String name){
        try{
            while(isFull){
                wait();
            }
            isFull = true;
            System.out.println(name+" is filling water");
            Thread.sleep(1000);
            System.out.println(name+" is done filling water");
            isFull = false;
            notify();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
