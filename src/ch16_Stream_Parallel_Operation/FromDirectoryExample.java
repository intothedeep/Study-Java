package ch16_Stream_Parallel_Operation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("/Users/intothedeep/Library/Mobile Documents/com~apple~CloudDocs/spring/test_thisisJava/doc", "linedata.txt");
		Path path = Paths.get("/Users/intothedeep/Library/Mobile Documents/com~apple~CloudDocs/spring/test_thisisJava");
		Stream<Path> stream = Files.list(path);
		
		stream.forEach(p -> System.out.println(p.getFileName()));
	}
}
