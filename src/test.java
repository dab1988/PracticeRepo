

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ascii[]= {65,66,67,68,69};
         
		String s= new String(ascii,1,3);
		
		System.out.println(s);
		
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(0, "Dabeer");
		map.put(1, "Haider");
		map.put(2, "RUKSHAR");
		map.put(3, "FATIMA");
		map.put(4, "Dabeer");
		map.put(5, "Haider");
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Dabeer"));
		
		System.out.println(map.get(4).toUpperCase());
		
		//1. Iterate Over Map for loop
		
		for(int i=0; i<map.size(); i++)
		{
			System.out.println("***********"+map.get(i));
		}
		
		System.out.println("**************************************************");
		//2. For Each
		
		for(Map.Entry<Integer, String> entry:map.entrySet())	
		{
			
			System.out.println(entry.getKey() +"****************"+ entry.getValue());
			
			
		}
		
		System.out.println("**************************************************");
		//3. Iterator
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Entry<Integer, String> entry = itr.next();
             System.out.println("Key = " + entry.getKey() +
                                 ", Value = " + entry.getValue());
        }
        System.out.println("**************************************************");
		//4.
     // looping over keys
        for (Integer name : map.keySet())
        {
            // search  for value
            String url = map.get(name);
            System.out.println("Key = " + name + ", Value = " + url);
        }
	}

}
