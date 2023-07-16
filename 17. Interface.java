/* interface fields by default
public static final vtype NAME = value;
all methods are abstract

public abstract return_type method_name();
no need to write public abstract

only public access specifier is used in interfaces
interface can be extends using extend keyword
interface can used in classes using implement keyword
*/
class Main{
    public static void main(String args[]){
        Test test = new Test();
        test.disp();
    }
}
interface ABC{
    void disp();
}
class Test implements ABC{
    // public keywords
    public void disp(){
        System.out.println("Asad");
    }
}