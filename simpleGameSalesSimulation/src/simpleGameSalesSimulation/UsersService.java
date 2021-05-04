package simpleGameSalesSimulation;

import java.rmi.RemoteException;

public interface UsersService {

	void addUser(Users players) throws RemoteException;
	void updateUser(Users players) throws RemoteException;
	void deleteUser(Users players) throws RemoteException;
	
}
