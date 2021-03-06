package day_4_3.Abstract;

import day_4_3.Entities.Campaign;
import day_4_3.Entities.Game;
import day_4_3.Entities.User;

public interface MarketService {

	void addToMarket(Game game);
	void buyAGame(Game game, User user);
	void startCampaign(Campaign campaign);
	void endCampaign(Campaign campaign);
}
