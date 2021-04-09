package StringConcept;

public class CopyString {

	public static void main(String[] args) {

		String x = "Ramesh";
		char y[] = x.toCharArray();
		int size = y.length;
		String a ="";
		int i = 0;
		while (i != size) {
			a+=y[i];
			++i;
		}

		System.out.println(y);
		System.out.println(a);
	}
}
