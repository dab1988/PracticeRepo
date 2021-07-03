
public class Tester {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		String str="I AM INDIAN";
		
		String name[]= str.split(" ");
	
		name[0]="I";
		
		name [1]="AM";
		
		name[2]="INDIAN";
		
		String temp= name[1];
		
		StringBuilder build= new StringBuilder(temp);
		temp = build.reverse().toString();
		System.out.println(temp);
		System.out.println(name[0]+" "+temp+" "+name[2]);
		
	}

}
