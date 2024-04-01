package Test;

import org.testng.annotations.Test;

public class Ps1 extends Ps{

   @Test
   public void child() {
	   parent();
	   Ps2 ps=new Ps2(3);
	   System.out.println(ps.increment());
	   System.out.println(ps.decrement());
	   System.out.println(ps.multiplication());
	   System.out.println(ps.devision());
   }

}
