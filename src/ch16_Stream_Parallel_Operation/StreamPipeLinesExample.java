package ch16_Stream_Parallel_Operation;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("Victor", Member.MALE, 35),
				new Member("Dio", Member.MALE, 41),
				new Member("capcha", Member.FEMALE, 32),
				new Member("Donald", Member.FEMALE, 30),
				new Member("Trump", Member.MALE, 45)
				);
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("남자 평균 나이: " + ageAvg);
	}
}
