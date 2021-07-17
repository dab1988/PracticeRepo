package TestNG;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternPrint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String name="AAaSssBbb";
		name=name.toLowerCase();
		
		String set="a4bd5c6";
		
		String pattern="\\d";
		
		Pattern p= Pattern.compile(pattern);
		
		Matcher m= p.matcher(set);
		
		String val="";
		
		while(m.find())
		{
			val=val+m.group();
		}
		
		System.out.println(val);
		
		char c[]= set.toCharArray();
		
		for (int i=0; i<c.length;i++)
		{
		if(Character.isDigit(c[i]))
		{
		if(c[i]=='4')
		{
		for (int j=0; j< 4; j++)
			{
				System.out.print("a");
			}
		}

		
		else if(c[i]=='5')
		{
			System.out.println();
		for (int j=0; j< 5; j++)
			{
				System.out.print("bd");
			}
		}
		
		else if(c[i]=='6')
		{
			System.out.println();
			for (int j=0; j< 6; j++)
			{
				System.out.print("c");
			}

		}
		
		}	
    }
		
	}
}
