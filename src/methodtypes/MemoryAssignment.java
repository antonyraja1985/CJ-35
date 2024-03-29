package methodtypes;

public class MemoryAssignment {
	
	 
	
	
	public static void main(String[] args) {
		
		System.out.println(args.hashCode());
		
		MemoryAssignment ma=new MemoryAssignment();
		
		
		System.out.println("========="+ma.hashCode());
		
		MemoryAssignment ma1=new MemoryAssignment();
		
		System.out.println(ma1.hashCode());
		
		MemoryAssignment ma2=ma;
		
		System.out.println(ma2.hashCode());
		
		ma=new MemoryAssignment();
		
		System.out.println("========="+ma.hashCode());
		
		System.out.println(new MemoryAssignment());
	}

}
