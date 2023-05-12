
public class Person {

	private String firstname;
	private	String lastname;
	private	String job;
	
	public Person() {
		this.firstname= "abdoou";
	}
	
	public Person(String firstname) {
		this.firstname= firstname;
	}
	
	
	public Person(String firstname, String lastname, String job) {
		this.firstname= firstname;
		this.lastname= lastname;
		this.job=job;
	}
	

	void setFirsName( String firstname ) {
		
		this.firstname = firstname;
	}
	
void setLastName(String lastname ) {
		
		this.lastname = lastname;
	}
void setJob( String job ) {
	
	this.job = job;
}

 public  String getFirstName( ) {
	
	return firstname;
}

 public String getLastName(  ) {
	
	return lastname;
}
 public String getJob( ) {

	return job;
}

public  void Introducing() {
	
	System.out.println("Hello my name is "+ getFirstName()+ " " + getLastName()+ " my job is " +getJob());
} 
}