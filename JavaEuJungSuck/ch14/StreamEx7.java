package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class StudentMk2 {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	StudentMk2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	String getName() {return name;}
	boolean isMale() {return isMale;}
	int getHak() {return hak;}
	int getBan() {return ban;}
	int getScore() {return score;}
	
	public String toString() {
		return String.format("[%s, %s, %d학년, %d반, %d점]", name, isMale? "남":"여", hak, ban, score);
	}
	enum Level{HIGH, MID, LOW}
}

public class StreamEx7 {

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
		
		System.out.printf("1. 단순분할(성별로 분할)%n");
		Map<Boolean, List<StudentMk2>> stuBySex = Stream.of(stuArr)
				.collect(partitioningBy(StudentMk2::isMale));
		
		List<StudentMk2> maleStudent = stuBySex.get(true);
		List<StudentMk2> femaleStudent = stuBySex.get(false);
		
		for(StudentMk2 s:maleStudent) System.out.println(s);
		for(StudentMk2 s:femaleStudent) System.out.println(s);
		
		System.out.printf("%n2. 단순 분할 +통계(성별 학생 수) %n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(partitioningBy(StudentMk2::isMale, counting()));
		
		System.out.println("남학생 수 :" + stuNumBySex.get(true));
		System.out.println("여학생 수 :" + stuNumBySex.get(false));
		
		System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
		Map<Boolean, Optional<StudentMk2>> topScoreBySex = Stream.of(stuArr)
				.collect(partitioningBy(StudentMk2::isMale, maxBy(comparingInt(StudentMk2::getScore))));
		
		System.out.println("남학생 1등 : " +topScoreBySex.get(true));
		System.out.println("여학생 1등 : " +topScoreBySex.get(false));
		
		Map<Boolean, StudentMk2> topScoreBySex2 = Stream.of(stuArr)
				.collect(partitioningBy(StudentMk2::isMale, collectingAndThen(maxBy(comparingInt(StudentMk2::getScore)), 
						Optional::get)));
		
		System.out.println("남학생 1등 : " +topScoreBySex2.get(true));
		System.out.println("여학생 1등 : " +topScoreBySex2.get(false));
		
		System.out.printf("%n 4. 다중분할(성별 불합격자, 100점 이하)%n");
		
		Map<Boolean, Map<Boolean, List<StudentMk2>>> failedStuBySex = 
				Stream.of(stuArr).collect(partitioningBy(StudentMk2::isMale, partitioningBy(s->s.getScore() <= 100)));
		List<StudentMk2> failedMaleStu = failedStuBySex.get(true).get(true);
		List<StudentMk2> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		for(StudentMk2 s:failedMaleStu) System.out.println(s);
		for(StudentMk2 s:failedFemaleStu) System.out.println(s);
	}
}
