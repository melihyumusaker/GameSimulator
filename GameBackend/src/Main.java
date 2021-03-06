
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,21,"12345678901","Melih","Yumuşaker","2000");
		Customer customer2 = new Customer(2,27,"12345678902","Enes","Yumuşaker","1994");
		Game game1 = new Game(1,"Silkorad",300);
		Game game2 = new Game(2,"LOTR-2",275);
		Campaign campaign1 = new Campaign(1," %10 Kampanyası" , 10);
		Campaign campaign2 = new Campaign(2," %20 Kampanyası" , 20);
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		
		customerManager.add(customer1);
		customerManager.delete(customer2);
		customerManager.upgrade(customer2, "Doruk" ,  "Acet");
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.upgrade(campaign1, "%30 Kampaynası", 30);
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(game2);
		gameManager.delete(game1);
		gameManager.upgrade(game1, "Knight", 800);
		gameManager.sellGame(game1, customer1);
		gameManager.campaingSellGame(game2, customer1, campaign1);
	}

}
