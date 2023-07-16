class Main{
    public static void main(String args[]){
        String str = "Hello";

        str.length();
        str.toUpperCase();
        str.toLowerCase();
        str.indexOf("lo");
        str.charAt(3);

        // change string into char array
        str.toCharArray();

        //  Concatenation
        str = str + "Java";
        str.concat("programming");
        


        /* -------------------------------
        Compare Strings
            = checks if both objects point to the same memory location
            .equals() evaluates to the comparison of values in the objects
        */

        //  equal()  :true/false
        str.equals(str2);

        //  compareTo method (on unicode basis)  :0|+n|-n
        int n = str.compareTo(str1);

        //  equalsIgnoreCase()  :true/false
        str.equalsIgnoreCase(str2);

        //  Objects.equals(o1,o2) :true/false (import java.util.*;)
        Objects.equals(str, str2);


    
    }
}