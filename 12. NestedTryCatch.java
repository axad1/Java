class Main{
    public static void main(String args[]){
        System.out.println("Argument lenght = " + args.length);
        if(args.length>0){
            int a,b,ans;
            // outer try block
            try{
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                // inner try block
                try{
                    ans = a/b;
                    System.out.println("Result = " + ans);
                }catch(ArithmeticException e){
                    System.out.println("Division by zero error");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid argument type");
            }
        }
        
    }
}