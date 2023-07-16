// delete()
import java.io.File;

class Main{
    public static void main(String args[]){
        File file = new File("data.txt");
        if(file.delete()){
            System.out.println(file.getName() + " is deleted");
        }else{
            System.out.println("Failed");
        }

    }
}