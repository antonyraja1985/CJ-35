package constructor;

public class Person  extends Object{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person(Person original) {
		
		this.name=original.name;
		this.age=original.age;
		
	}
	
	public String dd() {
		
		
		return this.getClass().getName();
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("raja",30);
		System.out.println(person.name);
		
		Person personeCopy=new Person(new Person("raja",30));
		
		System.out.println(personeCopy.name);
		
		String nn = person.dd();
		
		System.out.println(nn+person.hashCode());
	}

}
