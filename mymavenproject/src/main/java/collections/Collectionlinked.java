package collections;

import java.util.LinkedList;
import java.util.List;

public class Collectionlinked {

	public static void main(String[] args) 
	{
	 List<String> obj= new LinkedList<String>();
	 obj.add("Saji");
	 obj.add("Della");
	 obj.add("Celessia");
	 obj.add("Georgin");
	 obj.set(2, "CelessiaS");
	 System.out.println(obj);
	 
	 int a = obj.indexOf("Saji");
	 System.out.println(a);
	 int b = obj.lastIndexOf("Della");
	 System.out.println(b);
	 
	obj.remove("Della");
	 System.out.println(obj);
	 
	 obj.remove(0);
	 System.out.println(obj);
	 
	 String x = obj.get(0);
	 System.out.println(x);
	 
	 boolean y = obj.contains("Della");
	 System.out.println(y);
			 

	}

}
