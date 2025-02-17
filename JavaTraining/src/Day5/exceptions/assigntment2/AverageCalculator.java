package Day5.exceptions.assigntment2;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) throws Illegalarg{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter natural number");
		int n=in.nextInt();
		if(n<=0) {
			throw new Illegalarg();
		}
		System.out.println((n*(n+1))/2);
		

	}

}
