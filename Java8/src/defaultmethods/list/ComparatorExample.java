package defaultmethods.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		Comparator<String> stringLengthComparator = new StringLengthComparator();
		List<String> stringList = new ArrayList<>();
		stringList.add("medium string!!!!!!!!");
		stringList.add("big string!!!!!!!!!!!!!!!!!!");
		stringList.add("small string!");
		stringList.sort(stringLengthComparator);

		System.out.println(stringList);

	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		if (string1.length() > string2.length())
			return 1;
		if (string1.length() < string2.length())
			return -1;
		return 0;
	}

}