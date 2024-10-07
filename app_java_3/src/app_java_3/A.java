package app_java_3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		List<Integer> collect = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        List<Integer> collect2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(collect);
	}
}
