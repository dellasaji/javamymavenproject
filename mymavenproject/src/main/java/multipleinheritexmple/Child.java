package multipleinheritexmple;

public class Child implements Parent1, Parent2
{

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.display();
		obj.print();

	}
	public void display()
	{
		System.out.println("Parent 1");
	}
	public void print()
	{
		System.out.println("Parent 2");
	}

}
