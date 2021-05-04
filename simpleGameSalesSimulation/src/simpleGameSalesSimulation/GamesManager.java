package simpleGameSalesSimulation;

public class GamesManager implements GamesService{

	@Override
	public void buyGame(Users users, Games games) {
		System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" have succesfully purchased "+games.getName()+" for "+games.getPrice()+" $");
		
	}



	@Override
	public void buyCampaignGame(Users users, Games games, Campaign campaign, double discount) {
		System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" have succesfully purchased "+games.getName()+" with "+campaign.getCampaignName()+" for only "+(games.getPrice()- discount)+" $");
		
	}

}
