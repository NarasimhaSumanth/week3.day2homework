package week3.day2homework;

public class String_Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";

		for (int i = s.length()-1; i >= 0; i--) {
			char reverse = s.charAt(i);
			rev = rev + reverse;

		}
		
		System.out.println(rev);
		
		if (s.equals(rev)) {
			
			System.out.println("String "+s +" is "+ "Palindrome");
			
		} else {
			
			System.out.println("String "+s +" is "+ "not Palindrome");

		}

	}

}
