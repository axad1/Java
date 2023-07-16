/*
a class can implement multiple interfaces
class test implements a,b,c...
*/
class Main{
    public static void main(String args[]){
        Test2 test2 = new Test2();
        test2.dispC();
    }
}
interface A{
    int a = 10;
    void dispA();
}
interface B{
    int b = 20;
    void dispB();
}
interface C extends A, B{
    int c = 30;
    void dispC();
}
class Test implements A,B{
    public void dispA(){
        System.out.println("a = " + a);
    }
    public void dispB(){
        System.out.println("b = " + b);
    }
}
class Test2 implements C{
    public void dispA(){
        System.out.println("a = " + a);
    }
    public void dispB(){
        System.out.println("b = " + b);
    }
    public void dispC(){
        dispA();
        dispB();
        System.out.println("c = " + c);
    }
}