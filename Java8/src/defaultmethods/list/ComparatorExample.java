package defaultmethods.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<String> stringList = getStringList();

		// sortUsingComparator(stringList);
		// sortUsingLambda(stringList);
		sortUsingMethodReference(stringList);
		System.out.println(stringList);

	}

	private static void sortUsingMethodReference(List<String> stringList) {
		// stringList.sort(Comparator.comparing(s -> s.length()));
		stringList.sort(Comparator.comparing(String::length));
	}

	public static void sortUsingLambda(List<String> stringList) {
		stringList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	}

	public static void sortUsingComparator(List<String> stringList) {
		stringList.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}

		});
	}

	private static List<String> getStringList() {
		List<String> stringList = new ArrayList<>();
		stringList.add("medium string!!!!!!!!");
		stringList.add("big string!!!!!!!!!!!!!!!!!!");
		stringList.add("small string!");
		return stringList;
	}

}
