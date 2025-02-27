package Day15.AdvancedJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamDemo3 {
	public static void main(String args[]) {
		List<Integer>l=Arrays.asList(1,2,3,4,5,12,23,45,120,110,123);
		Integer a=l.stream().min(Integer::compare).get();
		System.out.println(a);
		Integer b=l.stream().max(Integer::compare).get();
		System.out.println(b);
		//Stream<Integer> s=
		//Integer d=l.collect(Collectors.averagingInt(num-> Integer.parseInt(num)));
		l.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("1")).forEach(System.out::println);
		
		String s="SaiPranav";
		List<Character> l1=new ArrayList<>();
		for(Character c:s.toCharArray()) {
			l1.add(c);
		}
		Map<Character,Long> m=l1.stream().collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()));
		System.out.println(m);
		
		List<String>a1=Arrays.asList("mam","sai","aba","amma");
		Comparator<String> co=(n1,n2)->n1.length()-n2.length();
		a1.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).sorted(co).limit(1).forEach(System.out::println);
	}
	

}
