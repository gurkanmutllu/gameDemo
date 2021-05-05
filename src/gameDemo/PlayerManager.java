package gameDemo;

public class PlayerManager implements PlayerService{

	PlayerCheckManager checkManager;
	
	public PlayerManager (PlayerCheckManager checkManager) {
		this.checkManager = checkManager;
	}
	
	@Override
	public void register(Player player) {
		if(checkManager.checkPlayer(player)) {
			System.out.println("Kontrol ba�ar�l�!");
			System.out.println("Oyuncu kaydedildi: " +player.getFirstName());
			System.out.println("Oyuncu ad�: "+player.getFirstName() +" " +player.getLastName());
			System.out.println("Oyuncu do�um y�l�: " +player.getDateOfBirth());
			System.out.println("************************************************************");
			
		}
		else {
			System.out.println("Hatal� oyuncu bilgi giri�i!");
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
            System.out.println("�sim Ba�ar�yla G�ncellendi: " + player.getFirstName());
        }
        else if(lasName != null) {
            player.setLastName(lasName);
            System.out.println("Soyad Ba�ar�yla G�ncellendi: " + player.getLastName());
        }
        else if(nationalIdentity != null) {
            player.setNationalIdentity(nationalIdentity);
            System.out.println("TC Kimlik No Ba�ar�yla G�ncellendi: " + player.getNationalIdentity());
        }
        else if(dateOfBirth != null) {
            player.setDateOfBirth(dateOfBirth);
            System.out.println("TC Kimlik No Ba�ar�yla G�ncellendi: " + player.getDateOfBirth());
        }
		System.out.println("************************************************************");
    }
	
}
