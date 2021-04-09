package StringConcept;

public class StringsPractice {



	public static void main(String[] args) {

		/*
		 * There are two ways to create java string String literal by String keyword
		 */

		String name = "Dinesh";
		System.out.println("The name of the person is : " + name);

		String names = new String("Dinesh Kumaar");
		System.out.println("The name of the person is : " + names);

		System.out.println("Find the 4th letter : " + name.charAt(4));

		int count=0;
		int i=0;

		char characters[]=name.toCharArray();

		for(char c : characters) {
			i++;
		}

		System.out.println("Number of characters is "+i);
		
		names = names.concat("\0");
		char character[]= names.toCharArray();
		
		while(character[count]!='\0') {
			count++;
		}
		
		System.out.printf("%d",count);

	}

}
