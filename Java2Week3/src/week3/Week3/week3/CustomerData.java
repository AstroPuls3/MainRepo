package week3;
import java.util.ArrayList;

import week3.Customers.PersonData;

// New class that extends the PersonData class
	  public class CustomerData extends PersonData {
			private int customerNumber;
			private boolean mailingList;
			protected ArrayList<Long> transactions;
	  
	  public CustomerData(String lastName, String firstName, String address, String phone, int customerNumber, boolean mailingList, ArrayList<Long> transactions) {
		  super(lastName, firstName, address, phone);
		  this.customerNumber = customerNumber;
		  this.mailingList = mailingList;
		  this.transactions = new ArrayList<>();
	  }
	  public CustomerData() { 
	  super();
	  customerNumber = 0;
	  mailingList = false;
	  transactions = new ArrayList<>();
	  
	  
	  
	  }
	  
	  public int getCustomerNumber() {
		  return customerNumber;
}
	  public boolean getMailingList() {
		  return mailingList;
	  }
	  protected ArrayList<Long> getTransactions() { 
		  return transactions;
	  }
}	 
	  
