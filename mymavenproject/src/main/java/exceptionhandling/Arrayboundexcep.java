package exceptionhandling;

public class Arrayboundexcep {

	public static void main(String[] args) 
	{
		try
		{
			
		
		int arr[]= {1,2,3};
		int x = arr[10];
		int y = arr[0];
		System.out.println(x);
		System.out.println(y);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			int a=10;
			int b=20;
			int c= a+b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Print y");
		}
	}

}
