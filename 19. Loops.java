class Main{
    public static void main(String args[]){
        //  Labelled loop to print pattern
        OuterLoop: for(int i=0; i<10; i++){
            System.out.println("");
            if(i==5)
                break;
            for(int j=0; j<5; j++){
                System.out.print("*");
                if(j==i)
                    continue OuterLoop;
            }
        }
        //  labelled loop ends
        
        //  -------------------------
        //  For-Each loop
        String cars[] = {"volvo", "bmw", "mazda"};
        for(String car: cars)
            System.out.println(car);
    }
}