package java_classed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMachingandReplace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a= 12345675;
		
		String val= String.valueOf(a);
		
		val= val.replaceAll("5", "0");		
		
		System.out.println(val);
		
		String name="Abcd49n8h93j100";
		
		String str="";
		
		for(char c: name.toCharArray())
		{
			if(Character.isDigit(c))
			{
				str= str+c+"+";
			}
		}
		System.out.println(str +"");
		
		//Pattern pat= Pattern.compile("[0-9]");  // it will return one by one
		
		//Pattern pat= Pattern.compile("\\D+"); // it will return chracter sequence
		
	    //Pattern pat= Pattern.compile("\\d+"); // it will return character sequence one by one
		
		int sum=0;
		int i=0;
		String New= "";
		Pattern pat= Pattern.compile("\\d+"); // it considers sequence of digits as one
		
		Matcher match= pat.matcher(name);
		
		while(match.find())
		{
			
			sum= sum+Integer.parseInt(match.group());
						
		     New= New+match.group()+"+";
			
			//System.out.print();	
		}
				
		StringBuilder build= new StringBuilder(New);
		
		int builder=build.lastIndexOf("+");
		build.replace(builder,builder+1, " ");
		System.out.println(build);
		}		
}