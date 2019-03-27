package ch15_collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		Map<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(79, "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(90), "Victor");
		scores.put(79, "wow");
		scores.keySet().stream().forEach(System.out::println);
		
	}
	
	public List list;
	public Stack<String> stack;
	
	public TreeMapExample2() {
		list = new ArrayList<>();
	}
	
	synchronized public void synchronizedAdd(Object e) {
		list.add(e);
	}
	
	
}
