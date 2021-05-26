package day_4_3;

import java.time.LocalDate;

import day_4_3.Abstract.UserManager;
import day_4_3.Concrete.CampaignManager;
import day_4_3.Concrete.GameManager;
import day_4_3.Concrete.MarketManager;
import day_4_3.Concrete.PlayerCheckManager;
import day_4_3.Concrete.PlayerManager;
import day_4_3.Entities.Campaign;
import day_4_3.Entities.Game;
import day_4_3.Entities.User;

public class Main {

	public static void main(String[] args) {
		UserManager playerManager = new PlayerManager(new PlayerCheckManager());
		User emre = new User(1,"11111111111","emre","uzun",LocalDate.of(1900, 1, 1));
		playerManager.save(emre);
		
		Game gta5 = new Game(1,"GTA 5","PC",LocalDate.of(2013, 9, 17),169f);
		Game ets2 = new Game(2,"ETS 2","PC",LocalDate.of(2012, 10, 19),39f);
		
		GameManager gameManager = new GameManager();
		gameManager.add(gta5);
		gameManager.add(ets2);
		
		MarketManager marketManager = new MarketManager();
		marketManager.addToMarket(gta5);
		marketManager.addToMarket(ets2);
		
		CampaignManager campaignManager = new CampaignManager(marketManager);
		Campaign summerSale = new Campaign(1, "Summer Sale", LocalDate.of(2021, 5, 27), LocalDate.of(2021,6,27), 50);
		
		marketManager.buyAGame(ets2, emre);
		
		campaignManager.createCampaign(summerSale);
		
		marketManager.buyAGame(ets2, emre);
		
		campaignManager.deleteCampaign(summerSale);
		
		marketManager.buyAGame(ets2, emre);		
	}

}
