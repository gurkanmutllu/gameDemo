package gameDemo;

public class PlayerManager implements PlayerService{

	PlayerCheckManager checkManager;
	
	public PlayerManager (PlayerCheckManager checkManager) {
		this.checkManager = checkManager;
	}
	
	@Override
	public void register(Player player) {
		if(checkManager.checkPlayer(player)) {
			System.out.println("Kontrol baþarýlý!");
			System.out.println("Oyuncu kaydedildi: " +player.getFirstName());
			System.out.println("Oyuncu adý: "+player.getFirstName() +" " +player.getLastName());
			System.out.println("Oyuncu doðum yýlý: " +player.getDateOfBirth());
			System.out.println("************************************************************");
			
		}
		else {
			System.out.println("Hatalý oyuncu bilgi giriþi!");
			System.out.println("************************************************************");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi: " +player.getFirstName() +" " +player.getLastName());
		System.out.println("************************************************************");
	}

	@Override
	public void update(Player player,String name ,String lasName,String nationalIdentity,String dateOfBirth) {
		
        if(name != null) {
            player.setFirstName(name);
            System.out.println("Ýsim Baþarýyla Güncellendi: " + player.getFirstName());
        }
        else if(lasName != null) {
            player.setLastName(lasName);
            System.out.println("Soyad Baþarýyla Güncellendi: " + player.getLastName());
        }
        else if(nationalIdentity != null) {
            player.setNationalIdentity(nationalIdentity);
            System.out.println("TC Kimlik No Baþarýyla Güncellendi: " + player.getNationalIdentity());
        }
        else if(dateOfBirth != null) {
            player.setDateOfBirth(dateOfBirth);
            System.out.println("TC Kimlik No Baþarýyla Güncellendi: " + player.getDateOfBirth());
        }
		System.out.println("************************************************************");
    }
	
}
