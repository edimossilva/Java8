package defaultmethods.list;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExampleLambda {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("medium string!!!!!!!!");
		stringList.add("big string!!!!!!!!!!!!!!!!!!");
		stringList.add("small string!");
		stringList.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));
		System.out.println(stringList);

	}
}
