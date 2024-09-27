package inheritance;

public class childclass extends parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	childclass obj = new childclass();
	obj.add();
	obj.display();
      
	}
  public void add()
  {
	  int a=10;
	  int b=20;
	  int c =a+b;
	  System.out.println(c);
  }
}
