package day_4_2.Abstract;

import java.rmi.RemoteException;

import day_4_2.Entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
