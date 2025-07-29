package ThreadPractice;

class VolatileKeyWord extends Thread{
    volatile boolean running = true;
    public void run(){
        System.out.println("Thread Started...");
        while(running){

        }
        System.out.println("Thread Stopped...");
    }
    public void stopRunning(){
        running = false;
    }
}

public class Demo {
    public static void main(String[] args) {
        VolatileKeyWord obj = new VolatileKeyWord();
        obj.start();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj.stopRunning();
    }
}
