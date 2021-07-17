package java_classed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HighestandLowest 
{


private static void findDuplicate(int arr[])
{

	
	if(arr.length==1 || arr.length<0)
	{
		System.out.println("Array is not defined well");
	}
	
//	int dup[]= new int[arr.length/2];
	int count=0;
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]==arr[j])
			{
			System.out.println(arr[i]);
			}
		}
	}
	//System.out.println(count);
	
}


public static void main(String args[])
{
	
	int array[]= {14,5,67,10,89,100,23,10,14};
	
	int min= array[0];
	int max= array[0];
	int temp=0;
	
	for(int i=0; i<array.length; i++)
	{
		if(min>array[i])
		{
			temp=min;
			min=array[i];
			
		}
		
		else if(max<array[i])
		{
			max=array[i];
		}
	}
	
	
	
	System.out.println(min+"---"+ max);
	
	findDuplicate(array);
	
	
	Set<Integer> set= Arrays.stream(array).boxed().collect(Collectors.toSet());
	
	Set<Integer> set1= new HashSet<Integer>();
		
	for(int i: array)
	{
		if(set1.add(i)==false)
		{
			System.out.println(i +" is a Duplicate Element");
		}
	}
	
	
}

}
