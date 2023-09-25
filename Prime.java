package basics;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number");
	      
	      int num = sc.nextInt();
	      
	      if(num == 2) 
	      {
	         System.out.println(num + " is a prime number");
	      } 
	      else 
	      {
	         
	         for(int i = 1; i <= num; i++) 
	         {
	            if(num % i == 0) 
	            {
	               c++;
	            }
	         }
	         
	         if(c == 2) 
	         {
	            System.out.println(num + " is a prime number");
	         } else 
	         {
	            System.out.println(num + " is not a prime number");
	         }
	      }
	   }
	}
	


