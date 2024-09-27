package exceptionhandling;

public class Numberformatexmple {

	public static void main(String[] args) 
	{
		try
		{
			
		String s="A";
		int i = Integer.parseInt(s);
		System.out.println(i);
		}
	catch(NumberFormatException obj)
		{
		System.out.println("Print it ");
		}
		finally 
		{
			System.out.println("Good morning  ");
		}
	}

}
