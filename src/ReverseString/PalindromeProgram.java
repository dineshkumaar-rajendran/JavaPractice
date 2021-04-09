package ReverseString;

public class PalindromeProgram {
	public	String reversed;
	public static void main(String[] args) {
		
		String name = "raDar";
		int length = name.length();
		String reversed ="";
		
		System.out.println(length);
		
		for(int i = length-1 ;i>=0;i--) {
			reversed+=name.charAt(i);
		}
		
		System.out.println(reversed);
		
		if(reversed.equalsIgnoreCase(name)) {
			System.out.println("This is a palindrome");
		}else
		{
			System.out.println("This is not a palindrome");
		}
	}
	
	

}
