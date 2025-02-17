package Day5.exceptions;

public class Ex1 {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			try {
				int c[]= {1,2,3,4};
				System.out.println(c[4]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
