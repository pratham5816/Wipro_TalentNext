package wiprotalent.Threads.PBLapp;

public class ThreadInfo {
    
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("Demo Thread");
        System.out.println("New name of Thread: " + t);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted!");
        }
    }
}
