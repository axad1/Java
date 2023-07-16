//  Use recursion to add all of the numbers up to 10.
class Main{
    public static void main(String args[]){
        int sum = sum(10);

        System.out.println(sum);
        
    }

    static int sum(int n){
        if(n>0)
            return n + sum(n-1);
        else
            return 0;
    }
}