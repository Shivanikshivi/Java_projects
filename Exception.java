package advance;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				int a=10, b=2;
				
				int c;
				
				try
				{
					c=a/b;
					System.out.println("The value of c is "+c);
					
					int arr[]= {3}; //index 0
					System.out.println("The value of arr[2]-->"+arr[2]);			
					
				}
				
				
				catch(RuntimeException ex)
				{
					ex.printStackTrace();
				}
				
				System.out.println("Inside Try block");
				

			}

		
	}
