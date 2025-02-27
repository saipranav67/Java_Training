package Day14.AdvancedJava;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctional {
	public static void main(String ar[]) {
	Consumer<Integer> c=(x)->System.out.println(x*x);//void return hence print
	c.accept(6);
	Supplier<String> mes=()->"Hello this frm supplier";
	System.out.println(mes.get());
	}
}
