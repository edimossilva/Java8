package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExmaple {
	public static void main(String[] args) {
		List<Course> courseList = getCourseList();
		showStudentsQuantityGreatherThan(courseList, 80);
		showSumInCoursesWithStudentQuantityGreaterThan(courseList, 80);
		showSubjectsInCoursesWithStudentQuantityGreaterThan(courseList, 80);
		createCourseListWithStudentQuantityGreaterThan(courseList, 100);
	}

	private static void createCourseListWithStudentQuantityGreaterThan(
			List<Course> courseList, int quantity) {
		System.out.println("createCourseListWithStudentQuantityGreaterThan");
		List<Course> coursesWithStudentQuantityGreaterThanI = courseList
				.stream().filter(c -> c.getStudentsQuantity() >= quantity)
				.collect(Collectors.toList());
		coursesWithStudentQuantityGreaterThanI
				.forEach(c -> System.out.println(c.getSubject()));

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

	private static List<Course> getCourseList() {
		List<Course> coursesList = new ArrayList<Course>();
		coursesList.add(new Course("Java", 100));
		coursesList.add(new Course("Ruby", 50));
		coursesList.add(new Course("c#", 80));
		coursesList.add(new Course("Cobol", 150));

		return coursesList;
	}
}
