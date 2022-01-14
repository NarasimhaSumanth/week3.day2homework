package week3.day2homework;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";

		int count = 0;

		char[] ch1 = str.toCharArray();

		for (int i = 0; i <= ch1.length-1; i++) {

			if (str.charAt(i) == 'e')
				count++;

		}
		System.out.println(count);

	}
}
