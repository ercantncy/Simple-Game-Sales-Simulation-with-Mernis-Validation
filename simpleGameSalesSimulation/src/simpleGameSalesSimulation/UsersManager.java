package simpleGameSalesSimulation;

import java.rmi.RemoteException;

public class UsersManager  implements UsersService{

	ValidationService validationService;
	
	public UsersManager(ValidationService validationService) {
		
		this.validationService = validationService;
	}

	@Override
	public void addUser(Users users) throws RemoteException {

		//calling static method to check user if its real or not with Mernis Validation Web Service
		Utils.checkUserToAdd(validationService, users);
		
		
		
	}

	@Override
	public void updateUser(Users users) throws RemoteException {
		
		//calling static method to check user if its real or not with Mernis Validation Web Service
		Utils.checkUserToUpdate(validationService, users);
	}

	@Override
	public void deleteUser(Users users) throws RemoteException {
		//calling static method to check user if its real or not with Mernis Validation Web Service
		Utils.checkUserToDelete(validationService, users);
		
	}

	
}
