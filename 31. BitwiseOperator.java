// Check the number of bytes
class Main{
    public static void main(String args[]){
        int i = 1, j = 0;
        while (i != 0) {
            // i = (i<<1);      // number of bits
            i = (i<<8);
            j++;
        }
        System.out.println(j);
    }
}