package ch14_lambda_functional;

public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi = (int ... x) -> {
			int result = 1;
			for (int n : x) {
				result *= n;
			}
			System.out.println(result);
		};
		fi.method(2);
		
		fi = x -> System.out.println(x);
		fi.method(3);
		
		fi = (x) -> { 
			System.out.println(x);
		};
		
		MyFunctionalInterfaceWith2Params fi2;
		
		fi2 = (x, y) -> {
			return x + y;
		};
		
		fi2 = (x, y) -> x + y;
		System.out.println(fi2.test(5, 7));
		
		fi2 = (int x, int y) -> x + y + 10;
		System.out.println(fi2.test(5, 10));
	}
	
	
	@FunctionalInterface
	public interface MyFunctionalInterface {
		public void method(int... x);
	}
	
	@FunctionalInterface
	public interface MyFunctionalInterfaceWith2Params {
		public int test(int x, int y);
	}
}
