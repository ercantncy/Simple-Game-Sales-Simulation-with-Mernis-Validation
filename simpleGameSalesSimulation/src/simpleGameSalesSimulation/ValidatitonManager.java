package simpleGameSalesSimulation;

import java.rmi.RemoteException;

public class ValidatitonManager implements ValidationService {

	@Override
	public boolean validateUser(Users users) throws RemoteException {
		// TODO Auto-generated method stub
		return users.getNationalIdentity().length()==11;
	}

}
