import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * 
		 
		 for(int i=0; i<p.length; i++)
		{
		
			if(p[i]<0)
			{			
					
			list.add(p[i]);
				
			}	
		}
		 
		 * 
		 */
		
		int a []= {2,3,3,4,5,5,6,7,8,8};
		
		Set<Integer> set= new HashSet<Integer>();
		
		int count=0;
		for(int b: a)
		{
			if(set.add(b)==false)
			{
			set.add(b);
			count++;
			}
		}
		 
	//	System.out.println(set +"-->"+ count);
		
		
		//int k[]= {1, -1, 3, 2, -7, -5, 11, 6};
		
		int p[]= {8,7,-2,-5,0,4,3,-9};
		
		//List<Integer> list =Arrays.stream(k).boxed().collect(Collectors.toList());
		
		//list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<p.length; i++)
		{
		
			if(p[i]>=0)
			{
			list.add(p[i]);
			Collections.sort(list);
			}
			
			else if (p[i]<0)
			{
							
						
				list.add(p[i]);
					
				//Collections.sort(list);
			}
			
		}
		
		System.out.println(list);
	}

}
