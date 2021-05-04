package simpleGameSalesSimulation;

import java.time.LocalDate;

//
//import java.util.ArrayList;

//import java.util.List;


public class Users {

	private int id=(int)Math.floor(Math.random()*(100-1)+0);
	private	String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate birthOfDate;
	private	String email;
	//private List<Game> library= new ArrayList<Game>();
	
	public Users(String firstName, String lastName, String nationalIdentity, LocalDate birthOfDate,String email) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthOfDate = birthOfDate;
		this.email=email;
	}
	
	public int getId() {
		return id;
	}

	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public List<Game> getLibrary() {
//		return library;
//	}
//
//	public void setLibrary(List<Game> library) {
//		this.library = library;
//	}
	
	
}
