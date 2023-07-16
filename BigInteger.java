import java.math.BigInteger;
class Main{
    public static void main(String args[]){
        BigInteger n;

        // using constants ie.   ZERO, ONE, TWO, TEN
        n = BigInteger.ZERO;

        // using function
        n = BigInteger.valueOf(54);

        // strings as integers
        n = new BigInteger("65");

        // mathematical operations
        n = n.add(BigInteger.TEN);
        n = n.subtract(BigInteger.TEN);
        n = n.multiply(new BigInteger("2"));
        n = n.divide(BigInteger.valueOf(10));
        n = n.remainder(BigInteger.TWO);
        
        // Extraction of value from BigInteger
        int x = n.intValue();
        long l = n.longValue();
        String s = n.toString();
        float f = n.floatValue();

        // Comparison with compareTo() returns -1, 0, 1
        if(n.compareTo(BigInteger.ONE) == 0)
        System.out.println("compare");

        // Equal check
        if(n.equals(BigInteger.TWO) == false)
        System.out.println("equal");

        System.out.println(s);
    }
}