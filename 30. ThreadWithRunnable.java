// importing Thread class for other methods
import java.lang.Thread;

class Main{
    public static void main(String args[]){
        // newborn state
        A a = new A();
        // passing reference to A class's object so that run() would be called from A
        // also new born state
        Thread thread = new Thread(a);
        // runnable state
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("Main Thread = " + i);
        }
        System.out.println("Exit Main");
    }
}

// Create Thread using Runnable Interface
class A implements Runnable{
    // run() method must be implemented
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread A = " + i);
        }
        System.out.println("A exit");
    }
}