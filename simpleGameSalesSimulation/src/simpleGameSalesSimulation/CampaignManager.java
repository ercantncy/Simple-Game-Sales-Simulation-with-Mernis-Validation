package simpleGameSalesSimulation;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign, Games games) {
		System.out.println(campaign.getCampaignName()+" has successfully added for "+games.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Games games) {
		
		System.out.println(campaign.getCampaignName()+" has successfully updated for "+games.getName());
	}

	@Override
	public void deleteCampaign(Campaign campaign, Games games) {
		System.out.println(campaign.getCampaignName()+" has successfully deleted for "+games.getName());
		
	}

	
	
}
