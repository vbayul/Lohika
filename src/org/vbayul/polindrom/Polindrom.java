package org.vbayul.polindrom;

public class Polindrom {
	
	public boolean checkString(String word)
	{
		for (int i = 0; i <= word.length()/2; i++) {
			if (!checkChatIsSame(word,i))
				return false;
		}
		return true;
	}
	
	private boolean checkChatIsSame(String word, int step)
	{
		char front = word.charAt(step);
		char rear = word.charAt(word.length()-1 - step); 
		return front==rear;
	}
}
