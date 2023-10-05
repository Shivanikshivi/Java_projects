package advance;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) 
    {
        
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        
        Integer[] myArray = myList.toArray(new Integer[myList.size()]);

        
        System.out.println("Array elements:");
        for (Integer num : myArray) {
            System.out.println(num);
        }
    }
}