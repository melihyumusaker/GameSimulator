
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " Kampanyas� belle�e eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " Kampanyas� bellekten silindi");
	}

	@Override
	public void upgrade(Campaign campaign, String name, double price) {
		System.out.println(campaign.getCampaingId() + " ID'li kampanyan�n ad�  " + 
		campaign.getCampaignName() 	+ " den " + name + "olarak, Kampanya y�zdesi ise" 
		+  campaign.getCampaignPercentage() + " den "  + price + "olarak de�i�tirildi");
		
		campaign.setCampaignName(name);
		campaign.setCampaignPercentage(price);
			
		
	}

}
