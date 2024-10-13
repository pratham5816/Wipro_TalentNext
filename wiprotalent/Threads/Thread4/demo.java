package wiprotalent.Threads.Thread4;

public class demo implements Runnable {
    
    public void run(){
        System.out.println("hi thread started");
    }


    public static void main(String[] args) {
        demo newdemo = new demo();
        demo olddemo = new demo();
        Thread newka = new Thread(newdemo);
        Thread oldka = new Thread(olddemo);
        oldka.start();
        newka.start();
    }
}
