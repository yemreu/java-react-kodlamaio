package day_4_3.Concrete;

import day_4_3.Abstract.MarketService;
import day_4_3.Entities.Campaign;
import day_4_3.Entities.Game;
import day_4_3.Entities.User;

public class MarketManager implements MarketService{
	
	private Campaign campaign;
	
	@Override
	public void addToMarket(Game game) {
		System.out.println(game.getName() + " oyunu markete eklendi.");
	}

	@Override
	public void buyAGame(Game game, User user) {
		float updatedPrice = campaign != null?game.getPrice() - (game.getPrice() / 100 * campaign.getDiscountRate()):game.getPrice();
		System.out.println(user.getFirstName() +", " + game.getName() + " oyununu başarıyla satın aldınız. Fiyat: " + updatedPrice);
	}

	@Override
	public void startCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	@Override
	public void endCampaign(Campaign campaign) {
		this.campaign = null;
	}

}
