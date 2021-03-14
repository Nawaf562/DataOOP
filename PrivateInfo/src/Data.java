
public class Data {

	
	private String username;
	private int pass;
    String wel;


	Data(){                  //constructor 
		
	}
	
	Data(String nnewuser , int newpass){                   
		
		username = nnewuser;
		pass = newpass;
	}
	public void setid(int nnewpass){  //Setter

		  this.pass = nnewpass;

	}	
	public void setuser(String nnewuser){  //Setter

	  this.username = nnewuser;

}	
	public String getusername(){             //Getter
		 
		 return username;
	}
	public int getpass(){             //Getter
		 
		 return pass;
	}
	 public void wel() {
		
		System.out.println("Hi"+username);
	}
}
