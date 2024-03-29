package stringbuffer;

public class StringBufferVsStringBulider {
	
	
	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		
		System.out.println("=============String Buffer Perforamnce start============");
		StringBuffer buffer=new StringBuffer();
		startTime=System.currentTimeMillis();
		
		for(int i=0; i<=1000000;i++) {
			
			buffer.append("hello"+i);
			//System.out.println(buffer);
		}
		endTime=System.currentTimeMillis();
		
		System.out.println("String Buffer total time"+(endTime-startTime));
		
		System.out.println("=============String Buffer Perforamnce end============");
		
		//String Builder
		
		System.out.println("=============String Builder Perforamnce start============");
	
		
		StringBuilder builder=new StringBuilder();
		startTime=System.currentTimeMillis();
		for(int i=0; i<=1000000;i++) {
			
			builder.append("hello"+i);
			//System.out.println(buffer);
		}
		endTime=System.currentTimeMillis();
		
		System.out.println("String BuILDER total time"+(endTime-startTime));
		System.out.println("=============String Builder Perforamnce end============");

	}

}
