package gameDemo;

public interface DiscountService {
	
	public static double discountedPrice(Campaign campaign, GameSale gameSale) {
		return gameSale.getGamePrice() - gameSale.getGamePrice()*campaign.getCampaignDiscount()/100;
		
	}

}
