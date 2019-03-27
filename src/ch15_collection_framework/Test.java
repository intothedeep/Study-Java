package ch15_collection_framework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.<Integer>toList());
//		list = Arrays.asList(arr); // List<Integer[]> 객체가 만들어진다. 
		list = IntStream.of(arr).boxed().collect(Collectors.toList());
		IntStream.range(1, 11).forEach(System.out::println);
		
	}
}
