package defaultmethods.list;

import java.util.ArrayList;
import java.util.List;


public class ConsumerExampleLambda {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("First String");
		stringList.add("second STRING");
		stringList.add("ThIrD StRiNg");

		stringList.forEach(s -> System.out.println(s.toUpperCase()));
		
	}
}
