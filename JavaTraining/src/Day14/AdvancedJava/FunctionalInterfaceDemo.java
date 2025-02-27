package Day14.AdvancedJava;
interface Arth{
	int add(int a,int b);
	
}
interface Aq<T>{
	T op(T a,T b);
}
public class FunctionalInterfaceDemo {
	public static void main(String args[]) {
		Arth ar=(int a,int b)-> a+b;
		Arth ar2=(int a,int b)->a*b;
		System.out.println(ar.add(1,2));
		System.out.println(ar2.add(2,3));
		 
		Aq<Double> ar3=(a,b)->a/b;
		System.out.println(ar3.op(6.0,2.0));
	}

}
