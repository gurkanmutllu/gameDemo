package gameDemo;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		GameSale gameSale = new GameSale();
		Campaign campaign = new Campaign();
		
		campaign.setCampaignName("Bayram kampanyasý");
		campaign.setCampaignId("345");
		campaign.setCampaignDiscount(10);
		
		gameSale.setGameName("GTA V");
		gameSale.setGameId("123");
		gameSale.setGamePrice(50);
		gameSale.setGameDescription("GTA V \nRol yapma oyunu \nFiyat: " +gameSale.getGamePrice());
		
		
		player.setFirstName("Gurkan");
		player.setLastName("Mutlu");
		player.setNationalIdentity("11111111111");
		player.setDateOfBirth("2000");
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		GameSaleManager saleManager = new GameSaleManager();
		CampaignManager campaignManager = new CampaignManager();
		
		playerManager.register(player);
		
		playerManager.update(player, "Ahmet", null, null, null);
		
		saleManager.seeGame(gameSale);
		
		campaignManager.discount(campaign, gameSale);
		
		saleManager.buyGame(player, gameSale);
		
		campaignManager.updateCampaign(campaign, "Yaz kampanyasý", null, 0);
		
		playerManager.delete(player);
		
		
	}

}
