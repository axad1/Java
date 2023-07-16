import java.io.PrintWriter;
class Main{
    public static void main(String args[]){
        PrintWriter writer = new PrintWriter(System.out);
        // String
        String str = "Hello";
        writer.print("this is me");

        writer.close();
    }
}