import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Krishna");
		names.add("Kanahiya");
		names.add("Gopal");
		names.add("Kanaha");
		names.add("Rama");
		names.add("Govinda");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("K")) {
				System.out.println(names.get(i));
				count++;
			}

		}
		System.out.println(count);
	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Krishna");
		names.add("Kanahiya");
		names.add("Gopal");
		names.add("Kanaha");
		names.add("Rama");
		names.add("Govinda");

		long ss = names.stream().filter(s -> s.startsWith("K")).count();
		System.out.println(ss);

//			long d=Stream.of("Krishna","Radha","Rama","Gaurango").filter(s->s.startsWith("R")).map(s->{
//				 s.toUpperCase();
//				 return true;
//				});
//			System.out.println(d);	

		// names.stream().filter(s->s.startsWith("K")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println(s));

		// names.stream().filter(s->s.startsWith("K")).limit(2).forEach(s->System.out.println(s));
	}

	//@Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Kanahiya");
		names.add("Gopal");
		names.add("Kanaha");
		names.add("Govinda");

		List<String> a = Arrays.asList("Krishna", "Radha", "Rama", "Gaurango", "Rameshwaram", "Rab");
		a.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("----------------------------------------");

		Stream<String> newStream = Stream.concat(names.stream(), a.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Radha"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollection() {
		/*
		List<String> a = Arrays.asList("Krishna", "Radha", "Rama", "Gaurango", "Rameshwaram", "Rab");
		List<String> li=a.stream().filter(s -> s.endsWith("a")).sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		li.forEach(s->System.out.println(s));
		*/
		
		
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		// print the unique number
		// sorted and print the third index		
		//values.stream().distinct().forEach(s->System.out.print(s));
		List<Integer> val=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(val.get(3));
		Assert.assertEquals(5, val.get(3));
		

	}

}
