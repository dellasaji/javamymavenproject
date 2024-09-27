package inheritance;

public class Hierchildb extends Hierparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierchildb obj = new Hierchildb();
		obj.add();
		obj.sub();
		

	}

	public void sub()
	{
		int d=30;
		int e=10;
		int f=d-e;
		System.out.println(f);
	}
}
