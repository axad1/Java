/* Thread Lifecycle
Active Thread
    newborn state
    runnable or ready state - start()
    running state
    blocked state
Killed Thread
    dead state

Thread can be created by two ways
1. by implementing Runnable Interface
2. by extending Thread class

Runnable Interface has run() method which is already implemented in Thread class
and other thread control methods are in Thread class

Object Class + Runnable Interface = Thread Class
*/

// Create Thread by using Thread Class
import java.lang.Thread;

class Main{
    public static void main(String args[]){
        // newborn state
        A a = new A();
        B b = new B();
        // runnable state and make other stack
        a.start();
        b.start();

    }
}

class A extends Thread{
    // override run() method
    // public must use
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread A = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    // override run() method
    // public must use
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread B = " + i);
        }
        System.out.println("Exit from B");
    }
}