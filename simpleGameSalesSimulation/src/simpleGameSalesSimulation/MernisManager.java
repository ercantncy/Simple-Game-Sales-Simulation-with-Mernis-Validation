package simpleGameSalesSimulation;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements ValidationService {

	KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
	@Override
	public boolean validateUser(Users users) throws RemoteException {
		// TODO Auto-generated method stub
		return kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(users.getNationalIdentity()),
				users.getFirstName().toUpperCase(),
				users.getLastName().toUpperCase(),
				users.getBirthOfDate().getYear());
	}

}
