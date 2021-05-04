package simpleGameSalesSimulation;

public class Campaign {
	private int id = (int) Math.floor(Math.random() * (300 - 201) + 200);
	private String campaignName;
	
	
	public Campaign( String campaignName) {
		super();
		
		this.campaignName = campaignName;
		
	}

	public int getId() {
		return id;
	}


	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	
	

}
