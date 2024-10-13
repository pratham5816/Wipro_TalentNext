package wiprotalent.Threads.PBLapp;

public class oneMoreDemo  extends Thread{
    
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Thread is running " + i);
        }
    }

    public static void main(String[] args) {
        oneMoreDemo x = new oneMoreDemo();
        x.start();
    }
}
