package Day15.AdvancedJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Account{
	int id;
	String name;
	long sal;
	public Account(int id, String name, long i) {
		super();
		this.id = id;
		this.name = name;
		this.sal = i;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}	
}

public class StreamCustomDemo {
	public static void main(String args[]) {
	List<Account>l=Arrays.asList(new Account(101,"Janaki",15000),
			new Account(102,"Sai",12000),
			new Account(103,"Pranav",17000));
	
	l.stream().map(a->a.name).forEach(System.out::println);
	
	List<Long> l1=l.stream().map(a->a.sal+500).collect(Collectors.toList());
	l1.stream().forEach(System.out::println);
	
	Comparator<Account> comp=(n1,n2)->n1.name.length()-n2.name.length();
	l.stream().sorted(comp).forEach(System.out::println);
	
	
	}
}
