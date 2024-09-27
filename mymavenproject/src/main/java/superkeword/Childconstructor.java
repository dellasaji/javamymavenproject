package superkeword;

public class Childconstructor extends Parentconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childconstructor obj = new Childconstructor(10,20);
		
	}
	
	public Childconstructor(int a, int b)
	{
		 super();
		 int c= a+b;
		 System.out.println(c);
	}

}
