// single
// multi-level
// heirarichal
// hybrid
class Main{
    public static void main(String args[]){
        B obj = new B(5,2);
        int add = obj.add();
        System.out.println("add = " + add);
    }
}
class A{
    int x,y;
    // constructor A
    A(int a, int b){
        x = a;
        y = b;
    }
    int add(){
        return x+y;
    }
}
class B extends A{
    // constructor B
    B(int a, int b){
        // super class constructor call
        super(a,b);
    }
}