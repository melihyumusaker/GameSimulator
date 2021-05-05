
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameId() + " ID'li " + game.getGameName() + " Oyunu K�t�phaneye Eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameId() + " ID'li " + game.getGameName() + " Oyunu K�t�phaneden Silindi");
		
	}

	@Override
	public void upgrade(Game game,String name, double price) {
		
		System.out.println(game.getGameId() + " ID'li oyunun ad�  " + game.getGameName() 
		+ " den " + name + "olarak. Fiyat� ise" +  game.getPrice() + " den "  + price + 
		"olarak de�i�tirildi");
		
		game.setGameName(name);
		game.setPrice(price);				
	}

	@Override
	public void sellGame(Game game, Customer customer) {
	
		System.out.println(game.getGameName() +  " Adl� oyunu "  + customer.getFirstName() +  " "+
		customer.getLastName() + " Sat�n alm��t�r");
		
	}

	@Override
	public void campaingSellGame(Game game, Customer customer, Campaign campaign) {
		
		double fiyat;
		fiyat = game.getPrice() * ((100-campaign.getCampaignPercentage()) / 100);
		System.out.println(customer.getFirstName() + " adl� kullan�c�m�z " + game.getGameId()
		+ " oyununu "  + campaign.getCampaignName() + " kampanyas�ndan yararlanarak " 
		+ fiyat + " TL'ye sat�n alm��t�r");
		
	}

	
	
}
