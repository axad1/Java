class Static{
    public static void main(String args[]){
        int n = Cube.cube(2);
        System.out.println("cube = " + n);
    }
}

class Cube{
    // Static method
    static int cube(int x){
        return (x*x*x);
    }
}