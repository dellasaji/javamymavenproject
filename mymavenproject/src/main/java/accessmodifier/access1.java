package accessmodifier;

public class access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   access1 obj = new access1();
   obj.add();
   obj.print();
   obj.print1();
   obj.print2();
   
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	private void print()
	{
		
		System.out.println("Hello");
	}
	protected void print1()
	{
		
		System.out.println("Hi");
	}
	 void print2()
	{
		
		System.out.println("Della");
	}
}
