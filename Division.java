package basics;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first integer: ");
		        int numerator = scanner.nextInt();

		        System.out.println("Enter the second integer: ");
		        int denominator = scanner.nextInt();

		        try {
		            int result = divide(numerator, denominator);
		            System.out.println("Result of division: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		        }

		        scanner.close();
		    }

		    public static int divide(int numerator, int denominator) {
		        if (denominator == 0) {
		            throw new ArithmeticException("Division by zero is not allowed.");
		        }
		        return numerator / denominator;
		    }
		
	}


