package ch14_lambda_functional;

import ch14_lambda_functional.MyFunctionalInterfaceExample.MyFunctionalInterface;

public class UsingThis {
	public int outterField = 10;
	
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner = new UsingThis().new Inner();
		
		inner.method();
//		Inner inner2 = new Inner(); // 이렇게는 사용하기 힘들다.
		
	}
	
	class Inner {
		int innerField = 20;
		public Inner() {
			System.out.println(this.innerField);
		}
		
		void method() {
			int outterField = 50; // local variable
			
			MyFunctionalInterface fi;
			fi = (x) -> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField);
				System.out.println();
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			};
			fi.method(10);
		}
		
	}
	
}
