package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/YY  : hh::mm::ss");
		
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	}

}
