package Polymorphism;

public class child1 extends parent1{
	
	public void add(int a, int b)
	{
		super.add(50,30);
		int c = a -b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        child1 obj = new child1();
        obj.add(30, 20);
	}

}
