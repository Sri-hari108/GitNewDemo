package Java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
        a.add("Krishna");
        a.add("Krishna");
        a.add("Hare");
        System.out.println(a);
        System.out.println(a.get(1));
        a.add("Ram");
        System.out.println(a);
        a.add(0, "Radha");
        
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        
        // for testing perspective//
        System.out.println(a.contains("Ram"));
        
        a.remove("Ram");
        System.out.println(a);
        
        // for testing perspective//
        System.out.println(a.contains("Ram"));// otherwise to validate this much we have to apply for loop in array.
        System.out.println(a.indexOf("Krishna"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        
        
        System.out.println("----------------------------------------------------------------");
        
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("Prabhupada");
        
        a.addAll(aa);
        for(String s:a) {
        	System.out.println(s);
        }
        
	}

}
