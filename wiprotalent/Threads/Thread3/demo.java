package wiprotalent.Threads.Thread3;

public class demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 10;i++){
                    System.out.println("Thread 2 Biker running "  + i);
                    try{
                    Thread.sleep(1000);
                    } 
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    }
            }
        });

        t1.start();
    }
}
