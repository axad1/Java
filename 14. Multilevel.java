class Main{
    public static void main(String args[]){
        C obj = new C();
        obj.disp();
    }
}
class A{
    void disp(){
        System.out.println("Hello World");
    }
}
class B extends A{
}
class C extends B{
}