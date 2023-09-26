package advance;
public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowException.throwArithmeticException(17);

		}

	}

	class ThrowException
	{
		static void throwArithmeticException(int age)
		{
			if(age<=18)
			{
				throw new ArithmeticException("age must be greater than 18");
				
			}
			else
			{
				System.out.println("age is greater than 18");
			}
			
		}
		
	}


