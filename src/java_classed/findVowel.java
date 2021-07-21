package java_classed;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findVowel {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		String nam="Dabeer", str="";
		
		String reg="[aeiou]";
		
		Pattern pat= Pattern.compile(reg);
		
		Matcher match= pat.matcher(nam);
		
		while(match.find())
		{
		str= str+match.group();	
		
		}
	
		System.out.println(str);
		
		HashSet set= new HashSet();
		int i=0;
		int size=str.length();
		while(size>0)
		{
		
		set.add(str.charAt(i));
		i++;
		size--;
		}
		System.out.println(set);
		
		String name="Dabeer", str1="";
	   Pattern pat1= Pattern.compile(reg);
		
		Matcher match1= pat1.matcher(nam);
		
		while(match1.find())
		{
		str1= str1+match1.group();	
		
		}
		
		String blank="";
		
		
		for(int k=0; k<str1.length(); k++)
		{
			for(int j=1; j< str1.length()-1; j++)
			{
				if(str1.charAt(k)==str1.charAt(j) & i!=j)
				{
				  	blank=blank+String.valueOf(str1.charAt(k));
				  	break;
				}
				
				else if (str1.charAt(k)!=str1.charAt(j+1))
				{
					blank=blank+String.valueOf(str1.charAt(k));
					break;
				}
			}
		}
		
		System.out.println(blank);
	}

}
