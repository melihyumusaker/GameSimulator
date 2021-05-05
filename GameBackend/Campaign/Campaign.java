
public class Campaign {

	private int campaingId;
	private String campaignName;
	private double campaignPercentage;
	
	public Campaign(int campaingId, String campaignName, double campaignPercentage) {
		super();
		this.campaingId = campaingId;
		this.campaignName = campaignName;
		this.campaignPercentage = campaignPercentage;
	}
	
	public int getCampaingId() {
		return campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignPercentage() {
		return campaignPercentage;
	}
	public void setCampaignPercentage(double campaignPercentage) {
		this.campaignPercentage = campaignPercentage;
	}
	
	
}
