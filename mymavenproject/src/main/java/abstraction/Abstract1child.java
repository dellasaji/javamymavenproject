package abstraction;

public class Abstract1child extends Abstract1 {

	public static void main(String[] args) {
		
		Abstract1child obj = new Abstract1child();
		obj.display();
		obj.hide();
		

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		System.out.println("Good morning");
	}

}
