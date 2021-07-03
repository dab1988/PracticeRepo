
public class overload
{

	  static int k=0;
	
	  
	  protected overload()
	  {
		  
	  }
	  
	int add(char a, char b)
	 {
		System.out.println("Float Method-->"+ (a+b));
		this.main('a');
		
		return a+b;
	 }
	
	int add(int a, int b)
	 {
		System.out.println("Int Method-->");
		return (a+b);
	 }
	
	public void main(int c) 
	{
		System.out.println(c);
		
	}
	
	protected overload returnThis()
	{
		return this;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		overload o= new overload();
		overload o1= new overload();
		//o.add(9, 10.4f);
		
		//o.main('A');
		
		System.out.println(o.k++);
		System.out.println(o1.k++);
		System.out.println(o.k);

	}


}
