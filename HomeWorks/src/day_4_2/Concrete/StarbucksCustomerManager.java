package day_4_2.Concrete;

import java.rmi.RemoteException;

import day_4_2.Abstract.CustomerCheckService;
import day_4_2.Abstract.CustomerManager;
import day_4_2.Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws RemoteException, Exception{
		if(customerCheckService.checkIfRealPerson(customer)) 		{
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
		
	}
}
