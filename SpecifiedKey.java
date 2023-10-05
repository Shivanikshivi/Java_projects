package hash;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String key = "exampleKey";
        int value = 42;
        hashMap.put(key, value);

        
        Integer retrievedValue = hashMap.get(key);

        
        if (retrievedValue != null) {
            System.out.println("Key: " + key + ", Value: " + retrievedValue);
        } else {
            System.out.println("Key not found in the HashMap.");
        }
    }
}








