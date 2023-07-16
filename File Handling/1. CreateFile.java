// createNewFile()
// getName()
/* methods
exists()
canWrite()
canRead()
compareTo()

*/

import java.io.File;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        File file = new File("data.txt");
        try{
            if(file.createNewFile()){
                System.out.println("Created");
            }else{
                System.out.println(file.getName() + " Already exist");
            }
        }
        catch(IOException  e){
            System.out.println("File Error");
            e.printStackTrace();
        }
        
    }
}