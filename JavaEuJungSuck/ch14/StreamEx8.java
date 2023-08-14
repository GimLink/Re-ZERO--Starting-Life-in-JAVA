package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class StreamEx8 {

	public static void main(String[] args) {
		StudentMk2[] stuArr = {
				new StudentMk2("이자바", true, 1,3, 300),
				new StudentMk2("김자바",true, 1,1, 200),
				new StudentMk2("안자바",true, 2, 2, 100),
				new StudentMk2("박자바",true, 2, 2, 150),
				new StudentMk2("소자바",true, 2, 1, 200),
				new StudentMk2("나자바",true, 3, 3, 290),
				new StudentMk2("감자바",true, 3, 3, 180),
				
				new StudentMk2("이자바",false, 1, 3, 300),
				new StudentMk2("김자바", false, 1, 1, 200),
				new StudentMk2("안자바", false, 2, 2, 100),
				new StudentMk2("박자바", false,2, 2, 150),
				new StudentMk2("소자바", false, 3, 1, 200),
				new StudentMk2("나자바", false, 3, 3, 290),
				new StudentMk2("감자바", false, 3, 3, 180),
		};
		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		Map<Integer, List<StudentMk2>> styByBan = Stream.of(stuArr).collect(groupingBy(StudentMk2::getBan));
		for(List<StudentMk2> ban : styByBan.values()) {
			for(StudentMk2 s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
		Map<StudentMk2.Level, List<StudentMk2>> stuByLevel = 
				Stream.of(stuArr).collect(groupingBy(s->
				{if(s.getScore()>=200) return StudentMk2.Level.HIGH;
				else if(s.getScore()>=100) return StudentMk2.Level.MID;
				else return StudentMk2.Level.LOW;}));
		TreeSet<StudentMk2.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(StudentMk2.Level key : keySet) {
			System.out.println("["+key+"]");
			for(StudentMk2 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		System.out.printf("%n3. 단순그룹화 + 통계 (성적별 학생수)%n");
		Map<StudentMk2.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					if(s.getScore()>=200) return StudentMk2.Level.HIGH;
				else if(s.getScore()>=100) return StudentMk2.Level.MID;
				else return StudentMk2.Level.LOW;
				}, counting()));
		for(StudentMk2.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		System.out.println();
		
		System.out.printf("%n4. 다중그룹화(학년별 반별)%n");
		Map<Integer, Map<Integer, List<StudentMk2>>> stuByHakBan = 
				Stream.of(stuArr).collect(groupingBy(StudentMk2::getHak, 
						groupingBy(StudentMk2::getBan)));
		for(Map<Integer, List<StudentMk2>> hak : stuByHakBan.values()) {
			for(List<StudentMk2> ban : hak.values()) {
				System.out.println();
				for(StudentMk2 s : ban) 
					System.out.println(s);
			}
		}
		
		System.out.printf("%n5. 다중그룹화 + 통계 (학년별, 반별 1등)%n");
		Map<Integer, Map<Integer, StudentMk2>> topStuByHakBan = Stream.of(stuArr).
				collect(groupingBy(StudentMk2::getHak, groupingBy(StudentMk2::getBan, collectingAndThen(
						maxBy(comparingInt(StudentMk2::getScore)), Optional::get))));
		for(Map<Integer, StudentMk2> ban : topStuByHakBan.values())
			for(StudentMk2 s : ban.values())
				System.out.println(s);
		
		System.out.printf("%n6. 다중그룹화 + 통계 (학년별 반별 성적그룹)%n");
		Map<String, Set<StudentMk2.Level>> stuByScoreGroup = Stream.of(stuArr).collect(
				groupingBy(s->s.getHak() + "-" + s.getBan(),
				mapping(s->{if(s.getScore() >=200) return StudentMk2.Level.HIGH;
				else if(s.getScore() >=100) return StudentMk2.Level.MID;
				else return StudentMk2.Level.LOW;
				}, toSet())));
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("["+ key + "]" + stuByScoreGroup.get(key));
		}
	}

}
