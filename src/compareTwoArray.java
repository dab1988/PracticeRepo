import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class compareTwoArray 
{

	
	static void date()
	{
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
	
		private static boolean checkArray(int a[], int b[])
	{
		
		
		int count=0;
		boolean flag = false;
		if(a.length!=b.length)
		{
			return false;
		}
		
		
		for(int i=0; i<a.length; i++)
		{
			for (int j=0; j<b.length; j++)
			{
				if((int)Math.pow(a[i], 2) == b[j])
				{
					count++;
					break;
					
				}
			}
		}
		
		if(a.length==count)
		{
			flag= true;
			throw  new IllegalArgumentException("dab");
		}
		
		return flag;
	}
	
		static boolean palindrome(String name)
		{
			boolean flag=true;
			
			
			for(int i=0; i<name.length()/2; i++)
			{
				
				if(name.charAt(i)!=name.charAt(name.length()-i-1))
				{
					flag=false;
					break;
				}
				
			}
			return flag;
		}
		
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		int a[]= {5,8,1,2,10,3,11};
		int b[]= {4,25,1,9,64};
		
		System.out.println(checkArray(a,b));
		
		System.out.println((int)(Math.pow(2, 2)));
		
	
		System.out.println(palindrome("DBAD"));
		
		int sum= Arrays.stream(a).reduce(0, (p,o)->p+o);
		System.out.println(sum);
		
		//Arrays.stream(a).sorted().map(m->m[m.length()]).forEach(System.out::println);
	
		
		int highest= a[0];
		int secondhighest= a[0];
		
         for(int i=1; i<a.length; i++)
         {
        	 if(a[i]>highest)
        	 {
        		 secondhighest=highest;
        		 
        		 highest=a[i];
        	 }
        	 
        	 else if (secondhighest<a[i])
        	 {
        		 secondhighest=a[i];
        	 }
        	
         }
		
		System.out.println(secondhighest);
		
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		
		date();
		
		String str1 = "abcdABCDabcdABCD";
		
		char c= 'a';
		int count=0;
		
		Character m[]= new Character [str1.length()];
		
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=1; j<str1.length()-1; j++)
			{
				if(str1.charAt(i)!=str1.charAt(j))
				{
					//str1=str1.replace("a", "");  to replace given character
					m[i]=str1.charAt(i);
					count++;
				}
			}
		}
		
		for(Character un: m)
		{
			System.out.print(un);
			
		}
		
		int start = 1;
		char end = 5;
		System.out.println(start + end);
	}

}
