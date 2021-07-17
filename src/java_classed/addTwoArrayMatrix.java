package java_classed;

public class addTwoArrayMatrix {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[][]= new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		int b[][]= new int[2][2];

		
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=5;

		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.println(a[i][j]+b[i][j]);
			}
		}
		
		
	}

}
