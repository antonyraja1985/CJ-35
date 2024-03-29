package encapsulation;

public class Client {

	public static void main(String[] args) {

//		Student student = new Student();
//
//		student.setId(10);
//
//		int id = student.getId();
//
//		System.out.println(id);
		
		Student student=new Student(10, "janani", "cse", 123456);
		
		int id=student.getId();
		
		String name=student.getStudentName();
		
		System.out.println(id);
		System.out.println(name);
		
		student.demo();
		
	}

}
