import java.util.ArrayList;
import java.util.Collections;

class Arraylist{
    public static void main(String args[]){
        // Create Arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list = new ArrayList<String>();
        // ArrayList<Boolean> list = new ArrayList<>();
        
        // add
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(0,1);
        System.out.println(list);

        // set element
        list.set(2,0);
        System.out.println(list);

        // remove element
        list.remove(4);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loops iterate
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}