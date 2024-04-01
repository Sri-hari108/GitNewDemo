package Java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
		hm.put(0, "Krishna");
		hm.put(1, "Krishna Priya");
		hm.put(2, "Mind");
		hm.put(3, "Hare Krishna");
		
		System.out.println(hm);
		hm.remove(2);
		
		System.out.println(hm);
		
		
//		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
//		
//		                                                       
//		
//		while(it.hasNext())  
//		{  
//		int key=(int)it.next();  
//		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
//		}
		
     Iterator<Entry<Integer, String>> its = hm.entrySet().iterator();       //entrySet() is a method  
		
		                                                       
		
		while(its.hasNext())  
		{  
			//System.out.println(its.next());
		Map.Entry<Integer, String> key=(Map.Entry<Integer, String>)its.next();  
		System.out.println(key.getKey());
		System.out.println(key.getValue()); 
		}

	    

	}

}
