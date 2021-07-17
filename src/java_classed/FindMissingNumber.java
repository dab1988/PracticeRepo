package java_classed;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		int x[]= {1,2,3,4,5,7,8,9,10};
		
		int length= x.length;
		
		int sum=Arrays.stream(x)
		.reduce(0, (a,b)->a+b);
		
		System.out.println(sum);
		
		System.out.println(10*(10+1)/2);
		
	}

}
