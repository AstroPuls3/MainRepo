import Customers.PersonData;
import Customers.PersonData.CustomerData;

// New class that extends the PersonData class
	  public class CustomerData extends PersonData {
			private int customerNumber;
			private boolean mailingList;
			private ArrayList<long> transactions;
	  }
	  public CustomerData(int customerNumber, boolean mailingList, ArrayList<long> transactions) {
		  this.customerNumber = customerNumber;
		  this.mailingList = mailingList;
		  this.transactions = transactions;
	  }
	// Copy Constructor
		public CustomerData(CustomerData other) {
			
	  
	
		  
	}