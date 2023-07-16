/* OutputStreamWriter along with the FileOutputStream
OutputStreamWriter extends Writer
FileOutputStream extends OutputStream
we can specify the type of character encoding (UTF8 or UTF16)
OutputStreamWriter output = new OutputStreamWriter(file, Charset cs);
*/
/* Methods of OutputStreamWriter
write()
write(char[] array)
write(String s)
getEncoding()
flush()
append()
close()
*/

import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        String str = "Output Stream Writer";
        try{
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("asad.txt");
            // Creates an OutputStreamWriter
            OutputStreamWriter writer = new OutputStreamWriter(file);
            // Writes string to the file
            writer.write(str);
            // Closes the writer
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}