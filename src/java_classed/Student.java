package java_classed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Student 
{

	int age;
	String name;
	
	static boolean flag=true;
	
	protected Student(int age, String name)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public static boolean isPrime(int number)
	{
		if(number==0 || number==1 || number==2)
		{
			return flag;
		}
		
		else
		{
			for(int i=2; i<=number/2; i++)
			{
				if(number%i==0)
				{
					flag=false;
				}
			}
		}
		
		
		return flag;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int fact=1, num=5;
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		
		System.out.println(fact);
		
		if(isPrime(8))
		{
			System.out.println("Prime Number");
		}
		
		else
		{
			System.out.println("Non Prime");
		}
		
		String name[]= {"name", "dabeer"};
			
		
		ArrayList<String> arr= new ArrayList<String>(Arrays.asList(name));
	//	arr.add(s);
		
		arr.add(2, "Dabeer");
		arr.add(3, "Haider");

		arr.set(2, "Rukhsar");
		System.out.println(arr);
				
		Student s= new Student(23, "Dabeer");
		
		Student s1= new Student(27, "Haider");
		
		ArrayList<Student> list= new ArrayList<Student>();
				
		
	   //list.stream().sorted().forEach(System.out::println);
		
		list.add(s);
		list.add(s1);

		ListIterator<Student> itr= list.listIterator();
		
		while(itr.hasNext())
		{
			Student s3= itr.next();
			
			System.out.println(s3.name +" "+ s3.age);
			
		}
		
		
		LinkedList li=new LinkedList();
		
		//li.pop();
		
		
		//1.
		String rev="Dabeer is not a Good Boy Uhh";
		
		String notRev="Dabeer", temp="";
		
		String index= rev.substring(notRev.length());	
		
		System.out.println(index);
		
		char c[]=null;
		
		for(int i=index.length()-1; i>=0; i--)
		{
			
			//System.out.print(rev.charAt(i));
			//c[i]= rev.charAt(1);
			
			temp=temp+index.charAt(i);

			//input.toLowerCase().matches(".*[aeiou].*");  vowel match
		}
		
		System.out.println(notRev+" "+temp);
	}
}
