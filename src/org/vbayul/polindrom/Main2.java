package org.vbayul.polindrom;

import java.util.Scanner;

public class Main2 {

	private static Scanner in;

	public static void main(String[] args) {

		Polindrom checkPolindrom = new Polindrom();
		
		in = new Scanner(System.in);
		System.out.println("Enter word for check: ");
		
		String word = in.nextLine();
		
		boolean polindrom = checkPolindrom.checkString(word);
		
		if (polindrom)
			System.out.println("Input string " + word + " is polindrom.");
		else
			System.out.println("Input string " + word + " is not polindrom.");
	}

}
