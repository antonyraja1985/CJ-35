package arrays;

public class ArrayExample {
	
	
	public static void main(String[] args) {
		
		
		
		
		
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers); //array size [n-1]
		
		//accessing elements using []
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		//How to find array length;
		
		int size=numbers.length;
		System.out.println("================foor loop=================");
		//interation elements using for loop
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i]);
		}
		
		System.out.println("===============forEach==================");
		//interation elements using forEach loop
		
		for(int num:numbers) {
			
			System.out.println(num);
			
		}
		
		
		String[] names={"janani", "vijay"};
		
		//interation elements using forEach loop
		
		for(String name:names) {
			System.out.println(name.ind);
			
		}
		
		String n="raja";
		
		n.fi
		//DrawBack of Array
		
		//we cant store the element in array -runtime
		//array memory is static
		//we cant store multiple types
		String[] namesOne={"janani", "vijay"};
		
		namesOne[2]="raja";
		
	   String[] namesTwo=new String[5];
		
	   namesTwo[5]="raja";
		
		System.out.println(namesOne);
		
		//memory issuse-perfoemance issue
		
		//array memory is static
		 String[] namesThree=new String[1000];
		
		 namesThree[0]="antony";
		 
		//we cant store multiple types
		 String[] namesFour=new String[10];
		 
		// namesFour[0]=10;
		 namesFour[1]="janani";
		 
		 //to over come all these issues market introduced
		
		 // collection  frame work
	}
	
	

}
