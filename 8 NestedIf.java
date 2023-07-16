// Check for greater value of 3 numbers
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.print("Enter c: ");
        int c = in.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }else{
                System.out.println("c is greater");
            }
        }else{
            if(b>c){
                System.out.println("b is greater");
            }else{
                System.out.println("c is greater");
            }
        }
    }
}