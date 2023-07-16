/* Reader abstract class
subclasses:
Buffered Reader
InputStreamReader
StringReader
FileReader extends InputStreamReader extends Reader
*/
/* Methods of Reader
ready()
read()
read(char[] array)
read(char[] array, int start, int length)
mark()
reset()
skip()
*/
/* Methods of FileReader
read(char[] array)
read(char[] array, int start, int length)
Todo:
*/

import java.io.FileReader;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        char[] array = new char[100];
        try{
            // create a reader using FileReader
            FileReader fileReader = new FileReader("asad.txt");

            // check if reader is ready()
            System.out.println("is there data in the stream? " + fileReader.ready());

            // read characters read()
            fileReader.read(array);
            System.out.println(array);

            // close()
            fileReader.close();
        }catch(IOException e){
            System.out.println("File Error");
            // e.printStackTrace();
        }
    }
}