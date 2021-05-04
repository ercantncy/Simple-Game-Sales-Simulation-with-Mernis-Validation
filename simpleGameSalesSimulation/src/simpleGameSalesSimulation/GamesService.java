package simpleGameSalesSimulation;

public interface GamesService {

	void buyGame(Users users, Games games);
	void buyCampaignGame(Users users, Games games, Campaign campaign,double discount);
}
