//  Works on objects only
class Main{
    
    public static void main(String args[]){

        String str = "Hello";
        str.getClass().getSimpleName();

        int n = 5;
        ((Object)n).getClass().getSimpleName();

        float f = (float)5.1;
        ((Object)f).getClass().getSimpleName();
        
    }
}