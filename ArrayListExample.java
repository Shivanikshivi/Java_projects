package advance;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();    
        stringList.add("Cow");
        stringList.add("Balloon");
        stringList.add("Chalk");
        stringList.add("Water");
        System.out.println("ArrayList before removing elements:");
        System.out.println(stringList);
        stringList.clear();
   
        System.out.println("ArrayList after removing elements:");
        System.out.println(stringList);
    }
}
