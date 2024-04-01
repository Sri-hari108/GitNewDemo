package Test;

public class Ps2 extends Ps3{
	
	int a;
	
	public Ps2(int a) {
		super(a);// for invoking the value in parent constructor
		this.a=a;
	}

	

	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}

}
