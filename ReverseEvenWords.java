package week3.day2homework;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String inputTest = "I am a software tester";
		String rev = "";
		String even = "";
		String outputTest = "";

		String[] words = inputTest.split(" ");

		for (int i = 0; i < words.length; i++) {
			// Find the even string

			if (i % 2 == 1) {

				even = words[i];
				// Iterate over the even string characters in reverse order

				for (int j = even.length()-1; j >= 0; j--) {
					// add each character into the output string

					rev = rev + even.charAt(j);
				}
					// Assign the reversed even string back to the inputStringArray

					words[i] = rev;
					even = "";

				}

			}

			outputTest = String.join(" ", words);
			System.out.println(outputTest);

		}

	}
