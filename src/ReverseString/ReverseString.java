package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
		String x = "Ramesh";
		char y[] = x.toCharArray();
		int size = y.length;
		System.out.println(size);
		char a[] = new char[size];
		for (int i = size-1; i >=0; i--) {
			a[size-1-i] = y[i]; //0,1
		}
		
		System.out.println(a);
		
		String name = "Dinesh";
		int length = name.length();
		String reverse ="";
		
		for(int i = length-1;i>=0;i--) {
		reverse +=name.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
	
}
