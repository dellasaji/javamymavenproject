package collections;

import java.util.ArrayList;

public class Collectgeneric {

	public static void main(String[] args) 
	{
	ArrayList<String> obj = new ArrayList<String>();//generic
	obj.add("Della");
	obj.add("Rose");
	obj.add("Saji");
	System.out.println(obj);
	
	ArrayList<String> obj1 = new ArrayList<String>();//generic
	obj1.add("Red");
	obj1.add("Blue");
	obj1.add("Green");
	System.out.println(obj1);
	
	obj.addAll(obj1);//merging 
	System.out.println(obj);
	
	boolean x = obj.contains("Red");
    System.out.println(x);
    
    System.out.println(obj.get(2));
    
    boolean y = obj.isEmpty();
    System.out.println(y);
    
    obj.remove(0);
    System.out.println(obj);
    
    System.out.println(obj.size());
    
	}

}
