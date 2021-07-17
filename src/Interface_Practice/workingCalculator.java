package Interface_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import java_classed.Student;

public class workingCalculator extends Student implements Calculator
{
	
	workingCalculator(int age, String name) {
		super(16, "kk");
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Calculator cal= new workingCalculator(16, "kk");
		//Calculator1 cal1= new workingCalculator(age, name);
		//cal.a
		//System.out.println(cal.show(10, 8));
		//cal.fibonacci();
		//cal1.
		//cal.removeDuplicate();
		//workingCalculator work= new workingCalculator(age, name);
		//int a=work.sum;
			
	}

	
	public void add3(int a)
	{
		
	}
	
	@Override
	public int add(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void multiply(int a, int b) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(float a, float b) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void average(int a, int b, double c) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public int add1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void fibonacci()
	{
	
		int num=10, firstNum=0, secondNum=1;
		
		int temp=0;
		
		System.out.print(firstNum +" "+secondNum+" ");
		
		while(num>0)
		{
			temp= firstNum+secondNum;
			firstNum=secondNum;
			secondNum=temp;
			System.out.print(temp+" ");
			num--;
		}
		System.out.println();
	}


	@Override
	public void removeDuplicate()
	{
		
		int a[]= {20, 20, 30, 40, 50, 50, 50};
		
		int j=0;
		int k=0;
		
		Set <Integer> set= new TreeSet<Integer>();
		
		for(int x: a)
		{
			if(set.add(x)==false)
			{
				a[k++]=x;
			}
			
			
			else
			{
				set.add(x);
			}
		}
		
		set.stream().forEach(System.out::println);
		
		
		System.out.println("Using For Loop");
		
		for(int i=0; i<a.length-1; i++)
		{
				
			if(a[i]!=a[i+1])
		     {
				a[j++]=a[i];
				
		     }
			
		}
		
		a[j++]=a[a.length-1];
		
		for(int i=0; i<j;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	@Override
	public void primeNumber() 
	{
		// TODO Auto-generated method stub
		
	}

}
