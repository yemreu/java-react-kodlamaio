package day_4_2.Abstract;

import day_4_2.Entities.Customer;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veritabanına kaydedildi: " + customer.getFirstName());
	}

}
