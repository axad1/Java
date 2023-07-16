/* StringWriter extends Writer

*/
/* Methods of StringWriter
write()
write(char[] array)
write(String data)
getBuffer()
toString()
*/
// write string data to the string buffer
import java.io.StringWriter;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        String str = "Text Line";
        try{
            StringWriter output = new StringWriter();
            output.write(str);

            System.out.println(output);
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}