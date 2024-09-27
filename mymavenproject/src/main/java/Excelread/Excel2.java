package Excelread;

import java.io.IOException;

public class Excel2 
{

	public static void main(String[] args) throws IOException
	{
		String y =Excel1.getstringdata(1, 0);
        System.out.println(y);
        String z =Excel1.getintegerdata(1, 1);
        System.out.println(z);
	}

}
