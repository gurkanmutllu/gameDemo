package gameDemo;

public interface PlayerService {
	
	void register(Player player);
	void delete(Player player);
	void update(Player player, String name, String lasName, String nationalIdentity, String dateOfBirth);
	
	
}
