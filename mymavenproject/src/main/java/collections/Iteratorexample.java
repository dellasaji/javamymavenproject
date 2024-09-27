package collections;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.print.DocFlavor.STRING;

//import javax.print.DocFlavor.STRING;

public class Iteratorexample 
{

	public static void main(String[] args) 
	{
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("Green");
		obj.add("Black");
        System.out.println(obj);
        Iterator<String> it = obj.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        it.remove();
        System.out.println(obj);
	}

}
