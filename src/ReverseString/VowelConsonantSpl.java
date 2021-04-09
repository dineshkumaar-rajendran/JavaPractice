package ReverseString;

public class VowelConsonantSpl {

	public static void main(String[] args) {
		String name = "Dinesh.Kumaar.Rajendran.1/463.M1";
		name = name.toUpperCase();
		name=name.replace(" ","");
		char c[] = name.toCharArray();
		int size = name.length();
		int VCount = 0;
		int Ccount = 0;
		int Ncount = 0;
		int Scount = 0;

		for (int i = 0; i < size; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
					VCount++;
				} else {
					Ccount++;
				}
			}
			
			else if(c[i] >='1'&&c[i] <='9') {
				Ncount++;
			}

			else {
				Scount++;
			}

		}

		System.out.println(name);
		System.out.println("The Consonant count is "+Ccount);
		System.out.println("The Vowel count is "+VCount);
		System.out.println("The Spl character count is "+Scount);
		System.out.println("The Number count is "+Ncount);
	}
}
