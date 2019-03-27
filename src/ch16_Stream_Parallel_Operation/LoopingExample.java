package ch16_Stream_Parallel_Operation;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("Case 1: Call peek() at the end");
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(n -> System.out.println(n));
		
		System.out.println("Case 2: Call the final processing method");
		int total = Arrays.stream(intArr)
				.filter(a -> a % 2 == 0)
				.peek(n -> System.out.println(n))
				.sum();
		System.out.println("총합: " + total);
		
		System.out.println("Case 3:Call forEach() at the end");
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.forEach(n -> System.out.println(n));
			
	}
}
