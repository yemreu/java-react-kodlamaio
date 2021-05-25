package day_4_2.Concrete;

import day_4_2.Abstract.CustomerCheckService;
import day_4_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		//fake mernis service
		return true;
	}


}
