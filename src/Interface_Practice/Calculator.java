package Interface_Practice;

public interface Calculator extends Calculator1
{

	String color="Black";
	int sum=0;
	int add(int a, int b);
	void multiply(int a, int b);
	void divide (float a, float b);
	void average(int a, int b, double c);	
	void fibonacci();
	
	private int display(int a, int b)
	{
		return a+b;
	}
	
	default int show(int a , int b)
	{
		int value= this.display(a,b);
		return value;
	}
	
	default void show1()
	{
		System.out.println("Interface Show1");
	}
	void removeDuplicate();
}
