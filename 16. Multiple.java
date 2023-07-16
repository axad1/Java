//  Multiple Inheritance
class Main{
    public static void main(String args[]){
        Result obj = new Result();
        obj.dispMarks();
    }
}

class Student{
    void disp(){
        System.out.println("Student");
    }
}
interface Marks{
    // it is already final and static
    int marks = 6;
    void dispMarks();
}

class Result extends Student implements Marks{
    // here public keyword necessary
    public void dispMarks(){
        disp();
        System.out.println("Marks = " + marks);  
    }
}