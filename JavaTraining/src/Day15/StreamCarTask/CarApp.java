package Day15.StreamCarTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
class CarServ implements CarService{

	@Override
	public double sumOfPrices(List<Car> carList) {
		double sum=carList.stream().map(x->x.getPrice()).reduce((double) 0,Double::sum);
		return sum;
	}

	@Override
	public List<String> getCarNames(List<Car> carList) {
		List<String>l=carList.stream().map(x->x.getCarName()).collect(Collectors.toList());
		return l;
	}

	@Override
	public Set<String> getCarMakers(List<Car> carList) {
		Set<String>l=carList.stream().map(x->x.getCareMake()).collect(Collectors.toSet());
		return l;
	}

	@Override
	public double getHighPricedCar(List<Car> carList) {
		return carList.stream().map(x->x.getPrice()).max(Double::compare).get();
	}

	@Override
	public Car getCarWithLowPricedCar(List<Car> carList) {
		Car cheapestCar = carList.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null); // Returns null if the list is empty

		return cheapestCar;
	}
	
}
public class CarApp{

	public static void main(String[] args){
		Car cars[]= {
						new Car("Maruti","Swift Dezire",810000.00),
						new Car("Hyundai","Verna",1100000.00),
						new Car("Toyota","Innova",2450000.00),
						new Car("Audi","Q3",4500000.00)
				
					};

		List<Car> carList = new ArrayList<>(Arrays.asList(cars));
		CarServ cr=new CarServ();
		System.out.println(cr.sumOfPrices(carList));
		List<String> l=cr.getCarNames(carList);
		l.stream().forEach(System.out::println);
		Car c=cr.getCarWithLowPricedCar(carList);
		System.out.println(c);
		try {
			//TODO
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
