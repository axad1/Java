// Abstract Class and Methods
class Main{
    public static void main(String args[]){
        z obj = new z();
        obj.disp();
        obj.disp2();
        obj.disp3();
    } 
}

// Abstract class
abstract class x{
    abstract void disp();
}

// Abstract class
abstract class y extends x{
    abstract void disp2();
    // normal method
    void disp3(){
        System.out.println("this is disp3");
    }
}

class z extends y{
    // implement all abstract methods
    void disp(){
        System.out.println("this is disp");
    }

    void disp2(){
        System.out.println("this is disp2");
    }
}