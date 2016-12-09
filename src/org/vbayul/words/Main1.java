package org.vbayul.words;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.vbayul.words.object.Word;

public class Main1 {

	private static Scanner in;

	public static void main(String[] args) {
		
		ReadFile readFile = new ReadFile();
		ParsingWord parsing = new ParsingWord();
		CountWords countWords = new CountWords();
		
		in = new Scanner(System.in);
		System.out.print("Enter path of text file:");

		String fileTxt = in.nextLine();
		
		List<String> lines = readFile.readFile(fileTxt);
		
		Set<String> words = parsing.parsingUnicWords(lines);
		List<String> allWords = parsing.parsingWords(lines);
		
		List<Word> repitWords = countWords.getCountWords(words, allWords);
		
		for (Word word : repitWords) {
			System.out.println(word.toString());
		}
		
	}

}
