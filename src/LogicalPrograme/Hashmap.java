package LogicalPrograme;

import java.util.HashMap;
import java.util.Set;

public class Hashmap 
{

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> mp = new HashMap<Integer,String>();
		
		mp.put(101, "suresh");
		mp.put(102, "mahesh");
		mp.put(103, "sandesh");
		
		System.out.println(mp.containsKey(104));
		System.out.println(mp.containsKey(103));
		
		Set<Integer> all = mp.keySet();
		
		for (Integer key : all) 
		{
			System.out.println(key+":"+mp.get(key));
		}
		
			
		
	}
}
