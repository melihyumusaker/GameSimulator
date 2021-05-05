
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameId() + " ID'li " + game.getGameName() + " Oyunu Kütüphaneye Eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameId() + " ID'li " + game.getGameName() + " Oyunu Kütüphaneden Silindi");
		
	}

	@Override
	public void upgrade(Game game,String name, double price) {
		
		System.out.println(game.getGameId() + " ID'li oyunun adý  " + game.getGameName() 
		+ " den " + name + "olarak. Fiyatý ise" +  game.getPrice() + " den "  + price + 
		"olarak deðiþtirildi");
		
		game.setGameName(name);
		game.setPrice(price);				
	}

	@Override
	public void sellGame(Game game, Customer customer) {
	
		System.out.println(game.getGameName() +  " Adlý oyunu "  + customer.getFirstName() +  " "+
		customer.getLastName() + " Satýn almýþtýr");
		
	}

	@Override
	public void campaingSellGame(Game game, Customer customer, Campaign campaign) {
		
		double fiyat;
		fiyat = game.getPrice() * ((100-campaign.getCampaignPercentage()) / 100);
		System.out.println(customer.getFirstName() + " adlý kullanýcýmýz " + game.getGameId()
		+ " oyununu "  + campaign.getCampaignName() + " kampanyasýndan yararlanarak " 
		+ fiyat + " TL'ye satýn almýþtýr");
		
	}

	
	
}
