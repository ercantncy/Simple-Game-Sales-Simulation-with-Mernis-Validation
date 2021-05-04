package simpleGameSalesSimulation;

import java.rmi.RemoteException;

public class Utils {

	public static void checkUserToAdd(ValidationService validationService, Users users) throws RemoteException {
		if (validationService.validateUser(users)) {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" has been successfully added.");
		} else {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" is not a valid Person.");
		}
	}
	
	public static void checkUserToUpdate(ValidationService validationService, Users users) throws RemoteException {
		if (validationService.validateUser(users)) {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" has been successfully updated.");
		} else {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" is not a valid Person.");
		}
	}
	
	public static void checkUserToDelete(ValidationService validationService, Users users) throws RemoteException {
		if (validationService.validateUser(users)) {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" has been successfully deleted.");
		} else {
			System.out.println(users.getFirstName().toUpperCase()+" "+users.getLastName().toUpperCase()+" "+" is not a valid Person.");
		}
	}
	
	
	
}
