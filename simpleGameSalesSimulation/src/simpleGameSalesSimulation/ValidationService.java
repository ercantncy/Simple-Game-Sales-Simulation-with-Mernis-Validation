package simpleGameSalesSimulation;

import java.rmi.RemoteException;

public interface ValidationService {
	boolean validateUser(Users users) throws RemoteException;
}
