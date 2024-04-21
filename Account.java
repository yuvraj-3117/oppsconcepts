package ENCAPSULATION;

public class Account {
	//A Account class which is a fully encapsulated class.  
		//It has a private data member and getter and setter methods.  
 
		//private data members  
		private long accno; //data hiding 
		private String name,email;  
		private float amount;  
		//public getter and setter methods  private dm ko acsese krne ke liye getter setter
		public long getAccno()
		{  
		    return accno;  
		}  
		public void setAccno(long accno)
		{  
		    this.accno = accno;  
		}  
		public String getName()
		{  
		    return name;  
		}  
		public void setName(String name) 
		{  
		    this.name = name;  
		}  
		public String getEmail() {  
		    return email;  
		}  
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		public float getAmount()
		{  
		    return amount;  
		}  
		public void setAmount(float amount) {  
		    this.amount = amount;  
		} }

	//A Java class to test the encapsulated class Account.  
	 class TestEncapsulation
	 {  
	public static void main(String[] args) 
	{  
	  //creating instance of Account class  
	  Account acc=new Account();  
	  //setting values through setter methods  
	  acc.setAccno(7560504000L); 
	  
	  acc.setName("Sonoo Jaiswal");  
	  
	  acc.setEmail("sonoojaiswal@javatpoint.com");  
	  
	  acc.setAmount(500000f);  
	  
	  //getting values through getter methods  
	  System.out.println(acc.getAccno()); 
	  System.out.println(acc.getName());
	  System.out.println(acc.getEmail());
	  System.out.println(acc.getAmount());
	}  
	}  



