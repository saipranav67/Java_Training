package Day14.AdvancedJava;

interface Arithimatic{
	int add(int a,int b);
	int mul(int a,int b);
	static void show() {
		System.out.println("hello from parent");
	}
	default void disp() {
		System.out.println("Disp from parent");
	}
}

public class JavaInterfaceDemo implements Arithimatic{
	public int add(int a,int b) {
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
	@Override
	public void disp() {
		System.out.println("Disp from child class");
	}
	
	 public static void show() {
		System.out.println("Show from child");
		
	}
	 public void showAll() {
		 Arithimatic.super.disp();
		 
	 }
	public static void main(String args[]) {
		Arithimatic a=new JavaInterfaceDemo();
		JavaInterfaceDemo a1=new JavaInterfaceDemo();
		a.disp();
		JavaInterfaceDemo.show();
		Arithimatic.show();
		a1.showAll();
	}
	

}
