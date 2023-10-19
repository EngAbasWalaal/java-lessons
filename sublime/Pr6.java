
public class Pr6{
	public static void main(String[] args) {
		//normal string
		String greetings="    Hello, world   , keep coding world .pdf";
		System.out.println("The string is "+greetings);
        
        //substring string function
		String substring =greetings.substring(0, 5);
		System.out.println("The substring of 0 and 5 is "+substring);

		//length function
		int strLength=greetings.length();
		System.out.println("The length of "+greetings+" is "+strLength);

		//specific index
		char singleChar=greetings.charAt(4);
		System.out.println("The index of specified chararcter is "+singleChar);

		//conversion of string into uppercase
		String upper=greetings.toUpperCase();
		System.out.println("The uppercase of string is "+upper);

		//convertion of string to lowercase
		String lower=greetings.toLowerCase();
		System.out.println("The lowercase of string is "+lower);


		//removing spaces 
		String trimmed=greetings.trim();
		System.out.println("The string after removed spaces is "+trimmed);

		//indexof and lastindexof
		int firstIndex=greetings.indexOf("world");
		System.out.println("The first index of world is "+firstIndex);

		int lastIndex=greetings.lastIndexOf("world");
		System.out.println("The last index of world "+lastIndex);


		//startsWith and endsWith string function
		boolean startsWithDoc=greetings.startsWith("hello");
		boolean endsWithPdf=greetings.endsWith("pdf");

		System.out.println(startsWithDoc);
		System.out.println(endsWithPdf);


	}
}