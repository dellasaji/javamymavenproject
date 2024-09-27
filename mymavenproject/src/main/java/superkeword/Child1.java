package superkeword;

public class Child1 extends parent1  {
	
	String s = "Morning";
	public void print()
	{
		System.out.println(s); 
		System.out.println(super.s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent1 obj = new Child1();
		Child1 obj = new Child1();
		obj.print();

	}

}
