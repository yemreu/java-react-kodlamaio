package day_4_2;

import java.time.LocalDate;
import day_4_2.Abstract.CustomerManager;
import day_4_2.Adapters.MernisServiceAdapter;
import day_4_2.Concrete.StarbucksCustomerManager;
import day_4_2.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		 CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		 customerManager.save(new Customer(1,"emre","uzun",LocalDate.of(1900,1,1),"11111111111"));
	}

}
