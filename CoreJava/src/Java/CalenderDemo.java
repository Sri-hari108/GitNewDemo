package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/YY");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.ALL_STYLES));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.ERA));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

}
