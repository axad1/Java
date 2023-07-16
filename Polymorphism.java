/*
Polymorphism 

Compile-time polymorphism (overload) | Static Binding - Early Binding
Method Overloading | same methods with different arguments

Runtime polymorphism (overriding) | Dynamic Binding - Late Binding
Method Overriding | same method with different implementation.

*/

// Main Class
class Main{
    public static void main(String args[]){
        Sub obj = new Sub();
        obj.disp();
    }
}

// Parent Class
class Super{
    void disp(){
        System.out.println("Hello");
    }
}

// Child Class
class Sub extends Super{
    void disp(){
        // super keyword
        super.disp();
        System.out.println("Asad");
    }
}