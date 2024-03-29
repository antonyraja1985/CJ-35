package encapsulation;

public class StudentDetails {
	

	
	public static void main(String[] args) {
		
		Student student =new Student();
		
		student.setId(10);
		
		int id= student.getId();
		System.out.println(id);
		
	}

}
