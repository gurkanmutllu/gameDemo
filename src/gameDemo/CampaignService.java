package gameDemo;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);	
	void updateCampaign(Campaign campaign, String name, String id, double discount);
	void discount(Campaign campaign,GameSale gameSale);
	void seeCampaign(Campaign campaign);
	
}
