package day_4_3.Concrete;

import day_4_3.Abstract.CampaignService;
import day_4_3.Entities.Campaign;

public class CampaignManager implements CampaignService{
	
	MarketManager marketManager;
	
	public CampaignManager(MarketManager marketManager) {
		this.marketManager = marketManager;
	}

	@Override
	public void createCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " (%" + campaign.getDiscountRate() + ") kampanyası başlatıldı.");
		marketManager.startCampaign(campaign);
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " (%" + campaign.getDiscountRate() + ") kampanyası bitirildi.");
		marketManager.endCampaign(campaign);
	}

}
