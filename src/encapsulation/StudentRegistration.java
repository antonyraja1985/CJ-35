package encapsulation;

public class StudentRegistration {
	
	
	public static void main(String[] args) {
		
    Student student =new Student();
		
		student.setId(100);
		
		int id= student.getId();
		System.out.println(id);
		
	}

}
