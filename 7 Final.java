// final keyword in java
// final is just like const
// value cannot be change once initialize
class Main{
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.disp();
        

    }
}

// for static variables
class Test{    
    // value can be initialize at creating time
    final static int x = 10;
    // or via static block
    final static int y;
    static{
        y = 20;
    }
    // constructor cannot initialize value to final variable
    // normal function cannot initialize value to final variable
    public void disp(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// for class instance variables
class Test2{
    // value can be initialize at creating time
    final int x = 30;
    // or via constructor
    final int y;
    Test2(){
        y = 40;
    }
    // normal function cannot initialize value to final variable
    public void disp(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// for local function variables
class Test3{
    // disp function
    public void disp(){
        // value can be initialize at creating time
        final int x = 50;
        // value can be initialize after creating
        final int y;
        y = 60;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// can be used as a parameter
class Test4{
    // but the value cannot be changed
    public void disp(final int x){
        System.out.println("x = " + x);
    }
}

// final methods cannot be overridden
class Parent{
    public final void disp(){
        System.out.println("Hi!");
    }
}
class Child extends Parent{
    // error will generate for overriding
    // public void disp(){

    // }
}

// final class cannot be extends
// final class cannot be inherited
final class A{

}
// class B extends A
// error