package Java;

public class StaticVar {
	String name;
	String address; // Instance Variable
    static String city; // Class Variable
    static int i; // It will share
    // int i=9;  // It will not share
    
    static {
    	city="Bihar";
    	i=12;
    	
    }
	
	StaticVar(String name,String address){
		this.name=name;
		System.out.println(this.name);
		this.address=address;
		System.out.println(this.address);
		System.out.println(city);
		i--;
		System.out.println(i);
		
	}
	
	public void getAddress() {
		System.out.println(address);
	}
	
	public static void getCity() {
		System.out.println(city);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar sv= new StaticVar("Ram","Ayodhya");
		StaticVar sv1= new StaticVar("Krishna","Vrindavan");
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getCity();
		StaticVar.city="Kashi";
		StaticVar.i=5;
		sv.name="Shiv";
		
		
		
		

	}

}
