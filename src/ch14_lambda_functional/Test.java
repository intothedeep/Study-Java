package ch14_lambda_functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public String outter = "outter";
	
	class RankedProduct {
		public String category1;
		public String category2;
		public String category3;
		public String category4;
		public String category5;
		
		public RankedProduct() {
			this.category1 = "one";
			this.category2 = "two";
			this.category3 = "three";
			this.category4 = "four";
			this.category5 = "five";
			System.out.println(Test.this.outter);
			System.out.println(this.toString());
 		}
		
		@Override
		public String toString() {
			return category1 + " " + category2 + " " + category3 + " " + category4 + " " + category5;
		}
		
		class InnerRankedProduct {
			public InnerRankedProduct() {
				new RankedProduct();
				System.out.println("inner RankedProduct!");
			}
		}

	}
	
	public static void main(String[] args) {
		RankedProduct rp = new Test().new RankedProduct();
		rp.new InnerRankedProduct();
		
		Map<String, String> map = new HashMap<>();
		map.put("category1", "one");
		map.put("category2", "two");
		map.put("category3", "three");
		map.put("category4", "four");
		map.put("category5", "five");
		
		List<String> inCids = Arrays.asList("three", "four"); 
		List<String> list = Arrays.asList("category1", "category2", "category3", "category4", "category5");
		boolean flag = list.stream().anyMatch(key -> {
			System.out.println(key + " : " + map.get(key));
			return inCids.contains(map.get(key));
		});
		System.out.println("flag: " + flag);
		
	}
}
