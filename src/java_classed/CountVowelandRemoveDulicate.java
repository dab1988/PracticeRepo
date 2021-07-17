package java_classed;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountVowelandRemoveDulicate 
{

	static  void SetInterface(String name)
	 {
		Set set= new TreeSet(); 
		 for(int i=0; i< name.length(); i++)
		 {
			 char c=name.toLowerCase().charAt(i);
			 
			 if(c=='a' || c=='e' || c=='i' 	|| c=='o' || c=='u' )
			{
				set.add(c);
			}
		 }
		 
		 set.stream().forEach(System.out::println);
	 }
	
	
	public static void main(String[] args)
	{
		
		String name="abBcEepkUnuOoI"; 
		
		SetInterface(name);
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		int count=0;
        int i=1;
		for(char c: name.toCharArray())
		{
			
			if(c=='a' || c=='e' || c=='i' 
					|| c=='o' || c=='u' )
			
			{
				map.put(c, i++);
				count++;
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey() +"---"+ entry.getValue());
		}
		
		//System.out.println(count);	
	}	
}