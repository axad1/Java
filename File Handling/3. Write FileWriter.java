/* FileWriter extends OutputStream extends Writer
Methods of FileWriter:
write()
write(char[] array)
write(String str)
flush()
append(char c)
*/ 

import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String args[]){
        try{
            // create
            FileWriter fileWriter = new FileWriter("asad.txt");
            // write
            fileWriter.write("Files in java are seriously good!");
            fileWriter.close();

        }catch(IOException e){
            System.out.println("File Error");
            e.printStackTrace();
        }
    }
}