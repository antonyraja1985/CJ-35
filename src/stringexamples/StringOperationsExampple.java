package stringexamples;

import java.util.Iterator;

public class StringOperationsExampple {

	public static void main(String[] args) {

		String name = new String("hello");

		String sentence = "Java is a Powerfull programming langguage" + " in 2024";

		// charAt()

		char output = sentence.charAt(5);

		System.out.println(output);

		// concat();

		String newSentance = sentence.concat("hello");

		System.out.println(newSentance);

		// length()

		int size = sentence.length();
		System.out.println(size);

		String studentName = "janani";

		// startsWith()
		boolean startsWith = studentName.startsWith("j");

		System.out.println(startsWith);

		// endsWith();
		boolean endsWith = studentName.endsWith("j");

		System.out.println(endsWith);

		String sentenceOne = "Java is a Powerfull programming langguage a";
         
		//.split();
		String[] splitSentence = sentenceOne.split("\\s+");// \\s+==empty space
		
		System.out.println(splitSentence);
		System.out.println(splitSentence[0]);
		System.out.println(splitSentence[1]);
		
		//indexOf();
		
	 	int indexOf = sentenceOne.inde
		
        System.out.println(indexOf);
        
      //lastIndexOf();
        int lastIndexOf = sentenceOne.lastIndexOf("a");
        System.out.println(lastIndexOf);
        
        String toUpperCase = sentenceOne.toUpperCase();
        
        System.out.println(toUpperCase);
        
	}

}
