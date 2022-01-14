package week3.day2homework;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] ch = test.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {

			if (Character.isLetter(test.charAt(i))) {

				letter++;

			}

		}
		if ((letter != 0)) {

			System.out.println("letter: " + letter);

		}

		for (int i = 0; i <= ch.length - 1; i++) {

			if (Character.isDigit(test.charAt(i))) {

				num++;
			}

		}
		if ((num != 0)) {

			System.out.println("num: " + num);
		}

		for (int i = 0; i <= ch.length - 1; i++) {

			if (Character.isSpaceChar(test.charAt(i))) {

				space++;

			}

		}
		if (space != 0) {

			System.out.println("space: " + space);

		}

		for (int i = 0; i <= ch.length - 1; i++) {

			if (!Character.isSpaceChar(test.charAt(i)) && !Character.isDigit(test.charAt(i))
					&& !Character.isLetter(test.charAt(i))) {

				specialChar++;

			}

		}
		if (specialChar != 0) {

			System.out.println("specialChar: " + specialChar);
		}
	}
}
