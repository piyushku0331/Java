package ThreadPractice;

public class DeadlockExample {
    public void fun1(){
        synchronized (Test.obj1){
            synchronized (Test.obj2){}
        }
    }
    public void fun2(){
        synchronized (Test.obj2){
            synchronized (Test.obj1){}
        }
    }
}