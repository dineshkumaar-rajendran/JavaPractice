package ReverseString;

public class VerifyIntegerString {

	public static void main(String[] args) {
		String number = "9578281281Din";
		/* char c[] = number.toCharArray(); */
		int size = number.length();

		for (int i = 0; i < size;) {
			if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {
				i++;
			} else {
				System.out.println("Given String is not integer String");
				System.exit(0);
			}
		}

		System.out.println("it is an Integer String");
	}
}
