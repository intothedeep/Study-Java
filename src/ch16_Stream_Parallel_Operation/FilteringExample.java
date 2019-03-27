package ch16_Stream_Parallel_Operation;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("victor", "dio", "wow", "jj", "jessie", "victor", "vvvvv");
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("j"))
			.forEach(n -> System.out.println(n));		
		System.out.println();
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("v"))
			.forEach(n -> System.out.println(n));
	}
}
