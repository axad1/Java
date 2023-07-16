class Main{
    public static void main(String args[]){
        One one = new One();
        one.disp();
        Two two = new Two();
        two.disp();
        Three three = new Three();
        three.disp();
    }
}
class One{
    void disp(){
        System.out.println("it is class one");
    }
}
class Two extends One{
}
class Three extends One{
}
