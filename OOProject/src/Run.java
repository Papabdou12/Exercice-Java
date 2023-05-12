
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course java = new Course();
		java.Name = "java";
		
		//System.out.println("The course name is: " +java.Name);
		
		Student s1 = new Student();
		/*s1.setFirstname("Coumba");
		s1.setlastName(" Dia");
		s1.setAge(25);
		s1.setCourse(java); */
		System.out.println(s1.firstName +s1.lastName +" are "+ s1.age + " years old and she" +  " is registered in " + s1.course.Name);

	}

}
