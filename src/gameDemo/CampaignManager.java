package gameDemo;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya kaydedildi!");
		System.out.println("Kampanya ismi: " +campaign.getCampaignName());
		System.out.println("Kampanya indirim yüzdesi: %" +campaign.getCampaignDiscount());
		System.out.println("************************************************************");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya baþarý ile silindi!");
		System.out.println("************************************************************");
	}

	@Override
	public void updateCampaign(Campaign campaign, String name, String id, double discount) {
		if(name != null) {
			campaign.setCampaignName(name);
			System.out.println("Kampanya ismi " +name +" olarak deðiþtirildi.");
			System.out.println("************************************************************");
		}
		else if(id != null) {
			campaign.setCampaignId(id);
			System.out.println("Kampanya id si " +id +" olarak deðiþtirildi.");
			System.out.println("************************************************************");
		}
		else if(discount != 0) {
			campaign.setCampaignDiscount(discount);
			System.out.println("Kampanya indirimi " +discount +" olarak deðiþtirildi.");
			System.out.println("************************************************************");
		}
		
	}

	@Override
	public void discount(Campaign campaign, GameSale gameSale) {
		System.out.println(gameSale.getGameName() +" oyunun bayram indirimi ile indirimli fiyatý: " +DiscountService.discountedPrice(campaign, gameSale));
		System.out.println("************************************************************");
	}

	@Override
	public void seeCampaign(Campaign campaign) {
		System.out.println("Kampanya adý: " +campaign.getCampaignName());
		System.out.println("Kampanya indirim yüzdesi: " +campaign.getCampaignDiscount());
		System.out.println("************************************************************");
	}

	

}
