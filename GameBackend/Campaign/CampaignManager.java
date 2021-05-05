
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " Kampanyasý belleðe eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " Kampanyasý bellekten silindi");
	}

	@Override
	public void upgrade(Campaign campaign, String name, double price) {
		System.out.println(campaign.getCampaingId() + " ID'li kampanyanýn adý  " + 
		campaign.getCampaignName() 	+ " den " + name + "olarak, Kampanya yüzdesi ise" 
		+  campaign.getCampaignPercentage() + " den "  + price + "olarak deðiþtirildi");
		
		campaign.setCampaignName(name);
		campaign.setCampaignPercentage(price);
			
		
	}

}
