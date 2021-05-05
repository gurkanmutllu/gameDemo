package gameDemo;

public class GameSaleManager implements GameService{

	
	@Override
	public void buyGame(Player player, GameSale gameSale) {
		System.out.println(player.getFirstName() +" " +player.getLastName() +" oyuncusu " +gameSale.getGameName() +" satýn aldý.");
		System.out.println("************************************************************");
	}

	@Override
	public void seeGame(GameSale gameSale) {
		System.out.println("Oyun özellikleri listelendi:  \n" +gameSale.getGameDescription());
		System.out.println("************************************************************");
	}
	
}
