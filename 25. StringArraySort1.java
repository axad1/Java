/* compareTo Function
if equal return 0
if greater return positive int
if smaller return negative int
case sensitive
check order of characters
*/

class Main{
    public static void main(String args[]){
        String[] str = {"Shaheen", "Maira", "Asad", "Ahsan", "Kamran"};
        // bubble sort
        for(int i=0; i<str.length-1; i++){
            for(int j=0; j<str.length-1-i; j++){            
                if(str[j].compareTo(str[j+1]) > 0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        // print
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}