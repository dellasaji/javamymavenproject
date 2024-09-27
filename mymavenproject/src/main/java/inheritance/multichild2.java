package inheritance;

public class multichild2 extends multichild1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multichild2 obj = new multichild2();
		obj.add();
		obj.display();
		obj.sub();
		
	}
	public void sub()
	{
		int d=20;
		int e=10;
		int f=d-e;
		System.out.println(f);
	}

}
