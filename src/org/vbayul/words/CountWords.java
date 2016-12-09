package org.vbayul.words;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.vbayul.words.object.Word;

public class CountWords {
	
	public List<Word> getCountWords(Set<String> words, List<String> allWords)
	{
		List<Word> result = new ArrayList<>();
		
		for (String word : words) {
			int count = count(word,allWords);
			result.add(new Word(word, count));
		}
		
		return result;
	}
	
	private int count(String unicWord, List<String> allWords)
	{
		int repit = 0; 
		for (String word: allWords) {
			if (unicWord.equals(word))
				repit = repit+1;
		}
		return repit;
	}

}
