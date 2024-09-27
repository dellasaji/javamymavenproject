package collections;

import java.util.List;
import java.util.ArrayList;

public class listexample {

	public static void main(String[] args) 
	{
		List<String> obj = new ArrayList<String>();
        obj.add("Della");
        obj.add("Rose");
        obj.set(1, "Yellow");//to change Rose to Yellow
        obj.add("Della");
        obj.add("Mary");
        System.out.println(obj);
        int a = obj.indexOf("Della");//first
        System.out.println(a);
        int b = obj.lastIndexOf("Della");
        System.out.println(b);
        obj.remove(0);
        System.out.println(obj);
        obj.remove("Mary");
        System.out.println(obj);
        String s = obj.get(0);
        System.out.println(s);
        boolean x = obj.contains("Mary");
        System.out.println(x);
	}

}
