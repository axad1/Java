/* InputStream abstract class
FileInputStream extends InputStream
*/
/* Methods of InputStream
read()
read(byte[] array)
available()
mark()
reset()
markSupported()
skips()
inputStream()
*/

// import java.io.fileInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        byte[] array = new byte[100];
        try{
            FileInputStream fileInputStream = new FileInputStream("asad.txt");
            // available bytes
            System.out.println("Available bytes in the file: " + fileInputStream.available());
            // read byte from input stream
            fileInputStream.read(array);
            // convert bytes array to string
            String str = new String(array);
            // print
            System.out.println(str);
            // close()
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
