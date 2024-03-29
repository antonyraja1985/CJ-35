package methodtypes;

public class MemoryAssignmentTestCase2 {
	
	int age=20;
	
	MemoryAssignmentTestCase2(){
		System.out.println("default constructor");
	}
	
	MemoryAssignmentTestCase2(int age){
		
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		MemoryAssignmentTestCase2 mat=new MemoryAssignmentTestCase2();
		
		System.out.println(mat.age);
		
		MemoryAssignmentTestCase2 mat2=new MemoryAssignmentTestCase2(30);
		System.out.println(mat2.age);
	
		System.out.println(mat.age);
	}

}
