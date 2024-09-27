package superkeword;

public class Childmethod extends Parentmethod {

	
	
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
   Childmethod obj =new Childmethod();
    obj.print1();
	}
	
	public void print1 ()
	{
		super.print();
		String s="Hello";
		System.out.println(s);
	}
	

}
