package java_classed;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountWordsUsingHashMap 
{
	
	
	private static void str(String name) 
	{	
		int size=name.length(), count=0;
		while(size>0)
		{
			count++;
			size--;
		}
		//name.sub
		System.out.println(count);
		System.out.println(name.lastIndexOf(""));
		
		int a[]= {1,2,3,5};
		
		int sum= Arrays.stream(a).reduce(0, (x,b)->x+b);
		
		int OriginalSum= a.length*(a.length+1)/2;
		
		System.out.println(OriginalSum);
		
		
	}
	
	static void findMax() throws Exception
	{
		
		File file= new File("C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\data.xlsx");
		FileInputStream fis= new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet= wb.getSheetAt(0);
		
		int size= sheet.getLastRowNum()+1;
		
		String name1[]= new String[size];
		
		for(int i=0; i<size; i++)
		{
		  name1[i]= sheet.getRow(i).getCell(0).getStringCellValue();
		}
		
		Arrays.stream(name1).forEach(System.out::print);
		
		String name[]= {"R308","R309","R340","R306"};
		
		String reg="\\d+";  // Regular Expression to filer digits in the group
		
		int a[]= new int[name.length]; // To create Integer Array of string size
		
		for(int i=0; i< name.length; i++)
		{
	
		Pattern pat= Pattern.compile(reg);
		
		Matcher match= pat.matcher(name[i]);
		
	     
		while(match.find())
		{
			
			a[i]=Integer.parseInt(match.group());  // Store Elements in the Integer array
			
			//System.out.print(match.group()+" ");
		}
	
	}
	
		int max = Arrays.stream(a).max().getAsInt();  // *Use of Java Stream API*....This is to find maximum number in the Integer Array
		
		System.out.println("Maximum Number is -->"+max);
		
		for(int i=0; i< name.length; i++)
		{
			//name.
			if(name[i].contains(String.valueOf(max))) // First convert int to String and then Check whether String contains number or not
			{
			System.out.println("Max Element in the String is-->"+ name[i]);	//Print Max String element
			}
			
		}
		
		
}
	
	
	
	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		findMax();
		
		String name= "yes You are my Life Partner yes you are";
		
		String name1[]= name.split(" ");
		int count=1;
		//Object ob= new Object();
			
		Map<String, Integer> map= new HashMap<String,Integer>();

		for(int i=0; i< name1.length; i++)
		{
			
			if(map.containsKey(name1[i]))
			{
				map.put(name1[i], map.get(name1[i])+1);
			}
			else
			{
				map.put(name1[i], 1);
			}
			
		}
		
		//System.out.println(map);
		
		str("dabeer haider");
		
	}
	
}
