package org.vbayul.words;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public List<String> readFile(String filePath)
	{		
		List<String> lines = new ArrayList<>();
		File file = new File(filePath);
		
		try (Scanner in = new Scanner(file))
		{
			while (in.hasNextLine())
			{
				lines.add(in.nextLine());
			}
		}
		catch (IOException e)
		{
			e.getStackTrace();
		}
		
		return lines;
	}
}
