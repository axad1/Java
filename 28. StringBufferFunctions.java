class Main{
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("Java");
        
        // return char charAt(index)
        char ch = str.charAt(3);

        // return void setCharAt(index, char)
        str.setCharAt(3, 'K');

        // delete character sequence
        // return StringBuffer delete(startIndex, endIndex+1)
        str.delete(2,4);

        // return StringBuffer deleteCharAt(index)
        str.deleteCharAt(1);

        // return StringBuffer append(any data type)
        str.append("AVA");

        // return StringBuffer insert(index, any data)
        str.insert(0, "I love ");

        System.out.println(str);
    }
}