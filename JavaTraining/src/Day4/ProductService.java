package Day4;
import java.util.*;
public class ProductService {
	public static Product getProduct(List<Product> l,int id) {
		Iterator<Product> it=l.iterator();
		while(it.hasNext()){
			Product p=it.next();
			if(p.id.equals(id)) {
				return p;
			}
		}
		return null;
	}
	public static double getPrice(List<Product> l,int id) {
		Iterator<Product> it=l.iterator();
		while(it.hasNext()){
			Product p=it.next();
			if(p.id.equals(id)) {
				return p.getPrice();
			}
		}
		return 0;
		
	}
	

}
