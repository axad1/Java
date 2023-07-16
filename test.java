class Main{
  public static void main(String args[]){
    System.out.println("ok");
    Test test = new Test();
    test.disp();
    
  }
}

class Test extends Car implements Sting{
  public void disp(){
    Sting.super.disp();
    super.disp();
  }
}

interface Sting{
  public default void disp(){
    System.out.println("interface");
  }
}

class Car{
  void disp(){
    System.out.println("Car class");
  }
}

