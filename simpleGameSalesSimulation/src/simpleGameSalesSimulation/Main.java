package simpleGameSalesSimulation;

import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		//defined Manager objects
		MernisManager mernisManager = new MernisManager();            
		UsersManager usersManager = new UsersManager(mernisManager);
		CampaignManager campaignManager= new CampaignManager();
		GamesManager gamesManager= new GamesManager();
		
		//defined field classes
		Users users1= new Users("Ercan", "Tuncay", "1234523123421", LocalDate.of(1993, 7, 9), "abc@gmail.com");
		Users users2= new Users("lale", "papatya", "123821484", LocalDate.of(1997, 7, 9), "abcd@gmail.com");
		
		Games games1= new Games("GTA", 99);
		Games games2= new Games("Need For Speed", 57);
		Campaign summerCampaign= new Campaign("Summer Campaign");
		
	
		
		
		//adding,updating and deleting users
		usersManager.addUser(users1);
		usersManager.updateUser(users1);
		usersManager.deleteUser(users1);
		System.out.println("----------------------------------------------------------------");
		usersManager.addUser(users2);
		usersManager.updateUser(users2);
		usersManager.deleteUser(users2);
		
		System.out.println("----------------------------------------------------------------");
		
		////adding,updating and deleting campaigns
		campaignManager.addCampaign(summerCampaign, games2);
		campaignManager.updateCampaign(summerCampaign, games1);
		campaignManager.deleteCampaign(summerCampaign, games2);
		System.out.println("----------------------------------------------------------------");
		
		//buying games with or without campaigns
		gamesManager.buyGame(users1, games2);
		gamesManager.buyCampaignGame(users2, games2, summerCampaign, 14);
		
		
	
		
	
	}

}
