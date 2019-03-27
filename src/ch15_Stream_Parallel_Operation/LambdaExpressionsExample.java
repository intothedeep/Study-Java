package ch15_Stream_Parallel_Operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("victor", 99), new Student("dio", 100)
		);
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " = " + score);
		});
		
		Arrays
			.stream(new int[] {1, 2, 3, 4, 5})
			.boxed()
			.forEach(System.out::println);
		
		
	}
}
