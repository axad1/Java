/* InputStreamReader along with the FileInputStream
    InputStreamReader extends Reader
    FileInputStream extends InputStream
reads bytes from the input stream as characters
reads the 2 bytes together and converts into corresponding character
we can specify the type of character encoding (UTF8 or UTF16)
    InputStreamReader input = new InputStreamReader(file, Charset cs)
*/
/* Methods of InputStreamReader
read()
read(char[] array)
read(char[] array, int start, int length)
getEncoding()
*/

import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        char[] array = new char[100];
        try{
            // creates a file input stream
            FileInputStream file = new FileInputStream("asad.txt");
            // creates an InputStreamReader
            InputStreamReader input = new InputStreamReader(file);
            // read characters from the file
            input.read(array);
            // print
            System.out.println(array);
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}