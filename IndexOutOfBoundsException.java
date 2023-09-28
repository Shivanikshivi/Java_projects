package basics;

public class IndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            int[] arr = {1, 2, 3, 4};
            int index = 5; // Accessing an out-of-bounds index
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element);
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Demonstrating StringIndexOutOfBoundsException
        try {
            String text = "Hello";
            char character = text.charAt(12); // Accessing an out-of-bounds index
            System.out.println("Character at index 10: " + character);
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

	}


