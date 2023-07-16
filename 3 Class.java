// Compile time polymorphism | Static binding | Method overloading
class Class{
    public static void main(String args[]){
        // Creating object
        Calc obj = new Calc();
        obj.calc(5);
        obj.calc(5,10);
    }    
}

public class Calc{
//  Method overloading
    public void calc(int x){
        System.out.println("Square = " + (x*x));
    }
    public void calc(int x, int y){
        System.out.println("Sum = " + (x+y));
    }
}