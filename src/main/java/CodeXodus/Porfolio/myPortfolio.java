package CodeXodus.Porfolio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class myPortfolio {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
    private Long id;
	
	private String firstName;
	private String lastName;
	private String yourMessage;
    private String email;
	private String phoneNumber;
	
	
	
	public myPortfolio() {
		//Empty constructor for JPA
	}
	
	
	
	public myPortfolio(String firstName, String lastName,String yourMessage,
	         String email, String phoneNumber) {
this.firstName = firstName;
this.lastName = lastName;
this.yourMessage = yourMessage;
this.email = email;
this.phoneNumber = phoneNumber;

}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getYourMessage() {
		return yourMessage;
	}



	public void setYourMessage(String yourMessage) {
		this.yourMessage = yourMessage;
	}






	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "myPortfolio [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", yourMessage="
				+ yourMessage + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

