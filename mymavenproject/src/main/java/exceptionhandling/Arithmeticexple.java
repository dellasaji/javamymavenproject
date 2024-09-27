package exceptionhandling;

public class Arithmeticexple {

	public static void main(String[] args)
	{
		try
		{
	
		int a = 20;
		int b= 0;
		int c = a/b;
		System.out.println(c);
		
	}
		//catch(ArithmeticException obj)
		/*catch(Exception obj)
		{
			System.out.println("Check your Calculation pls");
		}*/
		finally
		{
			System.out.println("Program once executed");
		}

	}

}
