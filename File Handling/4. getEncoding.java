import java.nio.charset.Charset;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        try{
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("asad.txt");
            // Creates an OutputStreamWriter with default encoding
            OutputStreamWriter writer1 = new OutputStreamWriter(file);
            // Creates an OutputStreamWriter specifying the encoding
            OutputStreamWriter writer2 = new OutputStreamWriter(file, Charset.forName("UTF8"));
            // Returns the character encoding of the output stream
            System.out.println("Character encoding of writer1: " + writer1.getEncoding());
            System.out.println("Character encoding of writer2: " + writer2.getEncoding());

            // Closes the writers
            writer1.close();
            writer2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}