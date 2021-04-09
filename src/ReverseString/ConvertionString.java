package ReverseString;

public class ConvertionString {

	public static void main(String[] args) {
		String name = "dinesh kumaar is automation engineer";
		char c[] = name.toCharArray();
		int size = name.length();

		for (int i = 0; i < size; i++) {
			if (c[i] != ' ') {
				c[i] = (char) (c[i] - 32);
			}

		}
		System.out.println(c);

	}
}
