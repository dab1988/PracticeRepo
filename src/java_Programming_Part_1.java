import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class java_Programming_Part_1  extends overload

{

    String name=null;
	
    public java_Programming_Part_1()
    {
    	//super();//Private not visible outside Class
    }
    
	private void findVowel(String name)
	{
		
		this.name=name;
		int count=0;
		char vowel;
		
		for(int i=0;i< name.length(); i++)
		{
			
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o'  || name.charAt(i)=='u')
			{
				System.out.println(name.charAt(i));
				
				 count++;
			}
			
		}
		
		
		System.out.println("Total Vowel Count are-->"+ count);
	}
	
	private void patter()
	{
    String name="ABCDEFGH";
		
		char [] nam= name.toCharArray();
		
		for(int i=0; i< nam.length; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(nam[j]);
			}
			System.out.println();
		}
		
	}
	
	private void switchCase(int i)
	{
		
		switch( i)
		{
		case 1:
			System.out.println("Monday");
			break;
	
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Entered number is not Eligibile to Find week days. Please Enter Number betweem 1 to 7 Range Only");
		
		}	
	}
	
	public static void main(String[] args)
	
	{
		
		String name1= "Dabeer";
		String name2="Dab";

		int a[]= {1,2,3,4,5,6};
		
		int removePosition=3;
		
		for(int i=0; i<a.length;i++)
		{
			if(i==removePosition)
			{
				a[i]=a[i+1];
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	//	System.out.println(name1.matches((".*"+name2+".*"))); // To Find Sub String using Regular Expression
		
		// TODO Auto-generated method stub
		
		java_Programming_Part_1 java= new java_Programming_Part_1();
		
		java.findVowel("DabeerHaider");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Day number in Numeric Format");
		
		int weekDay=sc.nextInt();
		
		//java.switchCase(weekDay);
		
	//	Arrays.sort
		String sortArray []= {"Zebra", "Catabeer", "Bird", "Apple"};
		
		Arrays.sort(sortArray);
		
		for (String name: sortArray)
	     {
			System.out.println(name);
	     }
		
		while(weekDay>0)
		{
			System.out.println("Do you want to Continue, Y/N,........");
			Scanner sc1= new Scanner(System.in);
			
			String value= sc1.nextLine();
		if(value.equals("Y"))
		{
			java.switchCase(sc.nextInt());
		}
		else if (value.equals("N") || (value.equals("n")))
		{
			System.exit(0);
		}
		
		}
	}

		
}
