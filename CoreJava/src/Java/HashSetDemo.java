package Java;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs =new HashSet<String>();
		hs.add("Krishna");
		hs.add("MayaDevi");
		hs.add("Devotee");
		hs.add("Prasadam");
		System.out.println(hs);
		
		hs.remove("MayaDevi");
		
		System.out.println(hs);
		System.out.println(hs.contains("MayaDevi"));
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
