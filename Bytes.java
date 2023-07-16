class Main{
    public static void main(String args[]){
        String str = "This is Java";
        // convert string into bytes
        byte[] dataBytes = str.getBytes();

        System.out.println(dataBytes);
    }
}