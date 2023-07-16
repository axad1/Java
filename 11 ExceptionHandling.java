// hit the exception
// throw the exception
// catch the exception
// handle the exception

// command line exception for NumberFormatException type
class Main{
    public static void main(String args[]){
        System.out.println("Argument lenght = " + args.length);
        if(args.length>0){
            int n = 0;
            try{
                n = Integer.parseInt(args[0]);
                System.out.println("number = " + n);
            }catch(Exception e){
                System.out.println("invalid: not integer argument");
            } finally {
                System.out.println("The 'try catch' is finished.");
            }
        }
    }
}

/*
Exception type list
ArithmeticException
ArrayIndexOutOfBoundsException
ArrayStoreException
FileNotFoundException
IOException
NullPointerException
*NumberFormatException
OutOfMemoryException
SecurityException
StackOverFlowException
StringIndexOutOfBoundsException
*/