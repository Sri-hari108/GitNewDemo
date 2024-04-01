package Java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedHashSet<String> hs =new LinkedHashSet<String>();
		hs.add("Krisha");
		hs.add("Radha");
		hs.add("Maya");
		hs.add("maya");  // DOES NOT ACCEPT DUBLICATE VALUE
		hs.add("kRISHNA");
		hs.add("radha");
		
		//System.out.println(hs);
		hs.remove("Maya");
		//System.out.println(hs);
		//System.out.println(hs.isEmpty());
		//System.out.println(hs.size());
		
		Iterator<String> i=hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		 
		
	}

}
