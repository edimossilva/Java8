package defaultmethods.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> stringList = getStringList();

//		showUsingConsumer(stringList);
//		showUsingLambda(stringList);
		showMethodReference(stringList);

	}

	public static void showMethodReference(List<String> stringList) {
		stringList.forEach(System.out::println);
	}

	public static void showUsingLambda(List<String> stringList) {
		stringList.forEach(s -> System.out.println(s));
	}

	public static void showUsingConsumer(List<String> stringList) {
		stringList.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}

		});
	}

	private static List<String> getStringList() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("First String");
		stringList.add("second STRING");
		stringList.add("ThIrD StRiNg");
		return stringList;
	}
}

class printUpperCaseConsumer implements Consumer<String> {
	@Override
	public void accept(String string) {
		System.out.println(string.toUpperCase());
	}
}
