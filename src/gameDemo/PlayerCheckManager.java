package gameDemo;

public class PlayerCheckManager{

	public boolean checkPlayer(Player player) {
		if(!player.getFirstName().isEmpty() && player.getDateOfBirth().length() == 4 && player.getNationalIdentity().length() == 11) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
