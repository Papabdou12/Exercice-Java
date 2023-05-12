
public class Employee {
//Exo 2
	String name;
	int year;
	int salary;
	String address;
	int hours;
	public void setName(String name) {
		this.name= name;
	}
	public void setYear(int year) {
		this.year= year;
	}
	public void setSalary(int salary) {
		this.salary= salary;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 public String getName(){
		    return name;
		  }
		  public int getYear(){
		    return year;
		  }
		  public int getSalary(){
		    return salary;
		  }
		  public String getAddress(){
		    return address;
		  }
	
	//Exo 3
		  
		  public void getInfo(String name, int salary, int hours) {
			  salary = 0;
			  hours = 0;
				
			}
			
			public int AddSal() {
				if(salary<500) {
					salary = salary + 10;
				}
				return salary;
			}
			
			public int AddWork() {
				if(hours > 6) {
					salary = salary + 5;
				}
				return salary;
			}
			
			void FinalSalary() {
				Employee empl = new Employee();
				salary = empl.AddSal();
				salary= empl.AddWork();
				System.out.println("Salary: "+ salary);
			}
		}
