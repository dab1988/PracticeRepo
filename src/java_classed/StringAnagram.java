package java_classed;

import java.util.Arrays;

public class StringAnagram 
{

	
	static boolean IsAnagra(String name, String name1)
	{
		boolean flag=false;
		if(name.length()!=name1.length())
		{
			
		return false;
		}
		
		char c[]= name.toCharArray();
		char c1[]= name1.toCharArray();
	     
		Arrays.sort(c);
		
	    Arrays.sort(c1);
	     
	     if(Arrays.equals(c, c1))
	     {
	    	 flag= true;
	     }
		
	     if(flag)
	     
	     {
	    	 return true;
	    	 
	     }
		
	     return false;
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String name1="dabeer";
		String name2="reemad";
		
		System.out.println(IsAnagra(name1, name2));
	
		System.out.println();
		
	}
}
