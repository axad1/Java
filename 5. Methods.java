import java.util.Scanner;
class Main{
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        System.out.print("Name: ");
        String name = scanner.next();

        greet(name);
        greet(name);
        greet(name);
        
    }

    static void greet(String str){
        System.out.println("Hello "+str);
    }
}