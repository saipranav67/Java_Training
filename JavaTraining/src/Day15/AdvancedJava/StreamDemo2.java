package Day15.AdvancedJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String args[]) {
		List<String>l=Arrays.asList("Sai","Pranav","JanakiRam","SaiNitin","Pavan");
		System.out.println("length of each word");
		l.stream().map(x->x.length()).forEach(System.out::println);
		
		System.out.println("To uppercase");
		l.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		
		System.out.println("sorted list");
		l.stream().sorted().forEach(System.out::println);
		
		System.out.println("length wise compare");
		Comparator<String> comp=(n1,n2)->n1.length()-n2.length();
		l.stream().sorted(comp).forEach(System.out::println);
		
		System.out.println("search for Sai");
		l.stream().filter(x->x.equals("Sai")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("ENDS WITH N");
		l.stream().filter(x->x.endsWith("n")).forEach(System.out::println);
		
		List<String> l2=Arrays.asList("java","jee","java","jee","python");
		
		Map<String,Long> res=l2.stream().collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()));
		System.out.println(res);
		}

}
