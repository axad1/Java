import java.util.Random;

class Main{
    public static void main(String args[]){
        // instance of Random class
        Random rand = new Random();
        // int
        int n = rand.nextInt();
        // long
        long l = rand.nextLong();
        // float
        float f = rand.nextFloat();
        // double
        double d = rand.nextDouble();

        System.out.println(n);

    }
}