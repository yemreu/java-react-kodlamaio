package day_4_3.Concrete;

import day_4_3.Abstract.PlayerCheckService;
import day_4_3.Entities.User;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		//fake mernis service
		return true;
	}


}
