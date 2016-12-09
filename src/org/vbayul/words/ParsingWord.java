package org.vbayul.words;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ParsingWord {
	
	public Set<String> parsingUnicWords(List<String> lines)
	{
		Set<String> unicWords = new TreeSet<>();
		
		for (String line : lines) 
		{
			String[] words = seperaitWords(line);
			unicWords.addAll(getUnicWords(words));
		}
		
		return unicWords;
	}
	
	public List<String> parsingWords(List<String> lines)
	{
		List<String> allWords = new ArrayList<>();
		
		for (String line : lines) 
		{
			String[] words = seperaitWords(line);
			allWords.addAll(getWords(words));
		}
		
		return allWords;
	}
	
	private String[] seperaitWords(String line)
	{
		String[] words = null;
		words = line.split(" ");
		
		return words;
	}
	
	private List<String> getWords(String[] words)
	{
		List<String> tempWords = new ArrayList<>();
		for (String word : words) {
			tempWords.add(word);
		}
		return tempWords;
	}
	
	private Set<String> getUnicWords(String[] words)
	{
		Set<String> tempUnicWords = new TreeSet<>();
		for (String word : words) {
			tempUnicWords.add(word);
		}
		return tempUnicWords;
	}
}
