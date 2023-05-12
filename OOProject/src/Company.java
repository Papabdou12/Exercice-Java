
public class Company {
	String name;
	int numberofemployee;
	double revenue;
	double expenses;
	
	
	
	public	void setName(String name) {
		this.name = name; 
	}
	
	public void setNumberOFEmployee(int numberofemployee) {
	 this.numberofemployee = numberofemployee ;
	}
	
	public void setRevenu( double revenue) {
		this.revenue= revenue;
	}
	
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	//Getter
	public	String getName() {
		return name; 
	}
	
	public int  getNumberOFEmployee() {
	 return numberofemployee ;
	}
	
	public double getRevenu() {
		return revenue;
	}
	
	public double getExpenses() {
		return expenses;
	}
	
	
}
