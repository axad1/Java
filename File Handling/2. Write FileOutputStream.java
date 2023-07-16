/* Output Stream abstract class
FileOutputStream extends OutputStream
*/
/* Methods of OutputStream
write()
write(byte[] array)
flush()
close()
*/
/* methods of FileOutputStream
finalize()
getChannel()
getFD()
*/

import java.io.FileOutputStream;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        String str = "Hello World";
        // convert string to bytes
        byte[] bytes = str.getBytes();
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("asad.txt");
            // write()
            fileOutputStream.write(str);
            // close()
            fileOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}