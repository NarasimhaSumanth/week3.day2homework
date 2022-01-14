package week3.day2homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		int l1 = text1.length();
		int l2 = text2.length();

		if (l1 != l2) {

			System.out.println("length not same");

		} else {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();

			System.out.println(ch1);
			System.out.println(ch2);

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			System.out.println(ch1);
			System.out.println(ch2);

			boolean equals = Arrays.equals(ch1, ch2);
			
			if(equals) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not an Anagram");
			}
			
			}

		}
	}
