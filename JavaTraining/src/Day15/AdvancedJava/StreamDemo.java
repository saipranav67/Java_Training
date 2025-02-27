package Day15.AdvancedJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
public static void main(String args[]) {
	Stream s=Stream.of(1,2,3,4,5);
	
	s.forEach((x)->System.out.println(x));
	System.out.println("Method ref");
	List<Integer> l=Arrays.asList(1,2,3,4,5,6,2,3,5,6,12,34,67,90);
	l.stream().forEach(System.out::println);
	
	System.out.println("distinct");
	l.stream().distinct().forEach(System.out::println);
	
	System.out.println("above 5 unique filter");
	l.stream().filter(x->x>5).distinct().forEach(System.out::println);
	
	System.out.println("above five limit 2 unique");
	l.parallelStream().filter(x->x>5).distinct().limit(2).forEach(System.out::println);
	
	//first five square
	System.out.println("First five Square");
	l.stream().limit(5).map(x->x*x).forEach(System.out::println);
	
	System.out.println("Reverse sorted");
	l.stream().limit(5).sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	Long a=l.stream().filter(x->x%2==0).count();
	System.out.println("Even number count "+a);
	
	int sum=l.stream().reduce((a1,b)->a1+b).get();
	System.out.println(sum);
	
	

}
}
