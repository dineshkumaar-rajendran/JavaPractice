package ReverseString;

public class ConvertFirstLettertoCapital {

	public static void main(String[] args) {
		String name = "dinesh kumaar is automation engineer";
		char c[] = name.toCharArray();
		int size = name.length();
		c[0] = (char) (c[0] - 32);
		for (int i = 1; i < size; i++) {
			if (c[i] == ' ') {
				c[i + 1] = (char) (c[i + 1] - 32);
			}
		}

		System.out.println(c);
	}
}
