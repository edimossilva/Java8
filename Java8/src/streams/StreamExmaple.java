package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExmaple {
	public static void main(String[] args) {
		List<Course> coursesList = getCoursesList();
		showStudentsQuantityGreatherThan(coursesList, 80);
		showSumInCoursesWithStudentQuantityGreaterThan(coursesList, 80);
		showSubjectsInCoursesWithStudentQuantityGreaterThan(coursesList, 80);
	}

	private static void showSubjectsInCoursesWithStudentQuantityGreaterThan(
			List<Course> coursesList, int quantity) {
		coursesList.stream().filter(c -> c.getStudentsQuantity() > 80)
				.map(Course::getSubject).forEach(System.out::println);
	}

	private static void showSumInCoursesWithStudentQuantityGreaterThan(
			List<Course> coursesList, int quantity) {
		int sum = coursesList.stream().filter(c -> c.getStudentsQuantity() > 80)
				.mapToInt(Course::getStudentsQuantity).sum();
		System.out.println(sum);
	}

	private static void showStudentsQuantityGreatherThan(
			List<Course> coursesList, int quantity) {
		coursesList.stream().filter(c -> c.getStudentsQuantity() > quantity)
				.forEach(c -> System.out.println(c.getStudentsQuantity()));
	}

	private static List<Course> getCoursesList() {
		List<Course> coursesList = new ArrayList<Course>();
		coursesList.add(new Course("Java", 100));
		coursesList.add(new Course("Ruby", 50));
		coursesList.add(new Course("c#", 80));
		coursesList.add(new Course("Cobol", 150));

		return coursesList;
	}
}
