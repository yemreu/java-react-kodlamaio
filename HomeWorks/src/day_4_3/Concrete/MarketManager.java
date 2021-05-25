package day_4_3.Concrete;

import day_4_3.Abstract.MarketService;
import day_4_3.Entities.Game;
import day_4_3.Entities.User;

public class MarketManager implements MarketService{
	
	@Override
	public void addToMarket(Game game) {
		System.out.println(game.getName() + " oyunu markete eklendi.");
	}

	@Override
	public void buyAGame(Game game, User user) {
		System.out.println(user.getFirstName() +", " + game.getName() + " oyununu başarıyla satın aldınız.");
	}

}
