package com.practice.problems;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIProblems {

	public static void main(String[] args) {
		
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x>=2 && x<=5).collect(Collectors.toList()));
		
		Predicate<Integer> predicate = x -> { return x>=2 && x<=5;};
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> predicate.test(x)).collect(Collectors.toList()));
		
		Emp emp = new Emp();
		Stream.of(1, 2, 3, 4).forEach(x -> emp.test(x));
		
	}

}

class Emp {
	void test(int x) {
		System.out.println("from employee test" + x);
	}
}
