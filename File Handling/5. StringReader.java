/* StringReader extends Reader
*/
/* Methods of StringReader
read()
read(char[] array)
read(char[] array, int start, int length)
ready()
mark()
reset()
*/

// read string data in characters
import java.io.StringReader;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        String str = "This is the text read from StringReader";
        char[] array = new char[100];
        try{
            // create a StringReader
            StringReader input = new StringReader(str);
            input.read(array);

            System.out.println(array);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}