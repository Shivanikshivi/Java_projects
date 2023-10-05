package advance;
import java.util.*;
public class TreeMapEg
{
    public static void main(String[] args) 
    {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        
        employeeMap.put(10, "Madhu");
        employeeMap.put(11, "Shivani");
        employeeMap.put(12, "Vaishu");
        employeeMap.put(13, "Maadhu");
        System.out.println("Names of employees in alphabetical order of IDs:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
        {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
