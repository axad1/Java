import java.util.Scanner;
class Input{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        // int
        System.out.print("int: ");
        int n = in.nextInt();

        // short
        System.out.print("short: ");
        short t = in.nextShort();

        // long
        System.out.print("long: ");
        long l = in.nextLong();

        // float
        System.out.print("float: ");
        float f = in.nextFloat();

        // double
        System.out.print("double: ");
        double d = in.nextDouble();


        // char
        System.out.print("char: ");
        char c = in.next().charAt(0);


        // string
        System.out.print("string: ");
        String word = in.next();
        // string line
        String str = in.nextLine();
        
    }
}