package day_4_3.Concrete;

import day_4_3.Abstract.PlayerCheckService;
import day_4_3.Abstract.UserManager;
import day_4_3.Entities.User;

public class PlayerManager extends UserManager{

	PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void save(User user) {
		if(playerCheckService.checkIfRealPerson(user)) {
			super.save(user);
		}else {
			System.out.println("Kişi geçerli değil");
		}
	}

	@Override
	public void update(User user) {
		super.update(user);
	}

	@Override
	public void delete(User user) {
		super.delete(user);
	}
	
	
}
