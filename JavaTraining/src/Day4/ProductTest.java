package Day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import Day4.ProductService;
public class ProductTest {

	public static void main(String[] args) throws IOException{
		List<Product> l=new ArrayList<>();
		FileReader f1=new FileReader("C:\\Users\\SaipranavKokkanda\\ProductList.txt");
		//1  given product is ---10 return  price of that product
		//2  given product id return product object
		//3. store all product objects into arraylist
		
		
		BufferedReader b=new BufferedReader(f1);
		String line=null;
		while( (line=b.readLine())!=null) {
			String[] s=line.split(",");
			l.add(new Product(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]),Double.parseDouble(s[3])));
		}
		

		ProductService ps=new ProductService();
		Scanner in=new Scanner(System.in);
		int i=0;
		int id;
		while(i!=-1) {
			String s="""
					1.press 1 for geting price of the product by giving product id.
					2.press 2 for getting the full details of the product from the product id.
					3.press -1 to exit.
					""";
			System.out.println(s);
			i=in.nextInt();
			switch(i) {
			case 1:
				System.out.println("Enter id");
				id=in.nextInt();
				System.out.println(ps.getPrice(l, id));
				
				break;
			case 2:
				System.out.println("Enter id");
				id=in.nextInt();
				System.out.println(ps.getProduct(l, id));
				break;
			
			case -1:

				break;
			}
		}

		

		
	}


}
