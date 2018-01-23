package week3;

public class Customers {

	public class PersonData {
		private String lastName;
		private String firstName;
		private String address;
		private String phone;
	

	// Constructor Method
	public PersonData(String lastName, String firstName, String address, String phone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phone = phone;		
		}
	// Copy Constructor
	public PersonData(PersonData other) {
		this.lastName = other.lastName;
		this.firstName = other.firstName;
		this.address = other.address;
		this.phone = other.phone;
	}
	//Accessor for Last Name
	public String getlastName() {
		return lastName;
		}
	// Accessor for First Name
	public String getFirstName() {
		return firstName;
	}
	
	// Accessor for Address
	public String getAddress() { 
		return address;
	}
	
	// Accessor for Phone
	public String getPhone() {
		return phone;
	}
	
	// Mutator for Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Mutator for First Name
	public void setFirstName(String firstName) {  
		this.firstName = firstName;
	}
	
	// Mutator for Address
	public void setAddress(String address) { 
		this.address = address;
	}
	
	// Mutator for Phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return String.format(lastName + ", " + firstName + " " + address + " " + phone);
	}
	
	  //Overriding equals
	  public boolean equals(Object obj) 
	  {
	    if (this == obj) return true;
	    if (obj == null) return false;
	    if (this.getClass() != obj.getClass()) return false;
	    PersonData that = (PersonData) obj;

	    if (!this.firstName.equals(that.firstName)) return false;
	    if (!this.lastName.equals(that.lastName)) return false;
	    if (!this.address.equals(that.address)) return false;
	    if (!this.phone.equals(that.phone)) return false;
		return true;
	  }
	  // Overriding Clone
	  public PersonData clone() { 
		  return new PersonData(this);
	  }

}
