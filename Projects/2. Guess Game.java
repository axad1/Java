import java.util.Random;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int n = new Random().nextInt(10) + 1;
        for(int i=5; i>0; i--){
            System.out.print("Guess a number (1 to 10)\t" + i + "): ");
            int x = new Scanner(System.in).nextInt();
            if(x<1 || x>10){
                System.out.println("Not in range");
                return;
            }
            if(x == n){
                System.out.println("\tYou got it!");
                return;
            }else if(x>n){
                System.out.println("\tToo higher");
            }else{
                System.out.println("\tToo lower");
            }
        }
        System.out.println("Better luck next time");
        System.out.println("Answer = " + n);
    }
}