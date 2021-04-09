package ReverseString;

public class PalindromeProgram2 {
	public String reversed;

	public static void main(String[] args) {

		String name = "sator arepo tenet opera rotas";
		name=name.replace(" ", "");
		name=name.toLowerCase();
		char a[] = name.toCharArray();
		int length = name.length();
		char b[] = new char[length];
		System.out.println(length);
		int i = 0;
		while (i != length) {
			b[length - 1 - i] = a[i];
			i++;
		}
		
		System.out.println(b);
		//System.out.println(i);

		i = 0;
		while (i!=length) {
			if (a[i] != b[i]) {
				System.out.println("This is not a palindrome");
				System.exit(0);
			} else {
				i++;
				continue;
			}

		}
		System.out.println("This is a palindrome");
	}

}
