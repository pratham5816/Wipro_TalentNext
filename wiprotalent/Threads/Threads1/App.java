package wiprotalent.Threads.Threads1;

class Runner extends Thread{
    
    public void run(){
        for(int i = 0; i < 10;i++){


            System.out.println("Thread 1 Runner running "  + i);

            try{
            Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
}

class biker extends Thread{

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
}


public class App {
    public static void main(String[] args) {

        Runner runner1 = new Runner();
        runner1.start(); 
        biker  x = new biker();
        x.start();
       
    }
}
