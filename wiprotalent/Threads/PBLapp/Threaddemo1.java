package wiprotalent.Threads.PBLapp;

public class Threaddemo1 extends Thread {
    public void run(){
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        Threaddemo1 threadDemo = new Threaddemo1();
        threadDemo.start();
    }
}
