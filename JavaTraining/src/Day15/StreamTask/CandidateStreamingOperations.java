package Day15.StreamTask;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
	List<Candidate>l=InterviewRepository.getCandidateList();
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		l.stream().filter(x->x.city=="Pune").forEach(System.out::println);

		//list city and count of candidates per city
		printLine();

		System.out.println("Candidate count per city");
		//List<String> re=l.stream().map(x->x.city).collect(Collectors.toList());
		Map<String,Long> res=l.stream().collect(Collectors.groupingBy(
				Candidate::getCity,
				Collectors.counting()));
		res.forEach((a,b)->System.out.println(a+":"+b));

		//list technical expertise and count of candidates
		printLine();

		System.out.println("Candidate count by Technical Expertise");
		List<Integer> re2=l.stream().map(x->x.exp).collect(Collectors.toList());
		Map<Integer,Long> res2=re2.stream().collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()));
		res2.forEach((cor,count)->System.out.println(cor+":"+count));


		printLine();

		//list fresher candidates
		System.out.println("Fresher Candidate list");
		l.stream().filter(x->x.getExp()==0).forEach(System.out::println);
		//listing candidates with highest experience
		printLine();

		Comparator<Candidate> co=(n1,n2)->n2.exp-n1.exp;
        System.out.println("Sorted List of Candidates by Experience");
        l.stream().sorted(co).forEach(System.out::println);


		//sort the candidates by city name
		printLine();
		Comparator<Candidate> com=(n1,n2)->n1.city.length()-n2.city.length();
		System.out.println("Sorted List of Candidates by City Name");
		l.stream().sorted(com).forEach(System.out::println);
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}