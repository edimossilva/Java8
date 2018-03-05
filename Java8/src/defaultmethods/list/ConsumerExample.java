package defaultmethods.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("First String");
		stringList.add("second STRING");
		stringList.add("ThIrD StRiNg");
		
		stringList.forEach(new printUpperCaseConsumer());
		
	}
}

class printUpperCaseConsumer implements Consumer<String> {
	@Override
	public void accept(String string) {
		System.out.println(string.toUpperCase());
	}
}
