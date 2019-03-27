package ch16_Stream_Parallel_Operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		// to call sort() method the Class has to implement compareTo method Like Student Class
		
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted() // ascending order: number 
			.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		System.out.println();

		List<Student> studentList = Arrays.asList(
				new Student("victor", 33),
				new Student("dio", 35),
				new Student("sup?", 100)
				);
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore()));
		System.out.println();
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getScore()));
		System.out.println();

		studentList.stream()
			.sorted((a, b) -> b.compareTo(a)) 
			.forEach(s -> System.out.println(s.getScore()));
	}
}
