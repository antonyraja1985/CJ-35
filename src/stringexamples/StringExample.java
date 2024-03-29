package stringexamples;

public class StringExample {
	
	
	
	public static void main(String[] args) {
		
		String course="java";
		
		System.out.println(course.hashCode());
		
		String course1=course+"fullstack";
		
		System.out.println(course1.hashCode());
		
		System.out.println("============================================");
		
		//String Literals
		
		String userName="admin";
		String userName1="admin new";
		System.out.println(userName);
		System.out.println("string literals: "+userName.hashCode());
		System.out.println("string literals: "+userName1.hashCode());
		System.out.println("===============================================");
		//using new keyword
		String userId=new String("admin");
		String userId1=new String("admin1");
		System.out.println(userId);
		System.out.println("new keyword: "+userId.hashCode());
		System.out.println("new keyword: "+userId1.hashCode());
		
		//Test
		System.out.println("==============================");
		String userIdT1=new String();
		userIdT1="client1";
		String userIdT2=new String();
		userIdT2="admin";
		System.out.println("new keyword:T "+userIdT1.hashCode());
		System.out.println("new keyword:T "+ userIdT2.hashCode());
		
		System.out.println("=============================================");
		
		
		String userNameLiterals="admin2";
		
		System.out.println(userNameLiterals.hashCode());
		
		
		
		
	}

}
