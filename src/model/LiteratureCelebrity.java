package model;

import java.util.ArrayList;
import model.Celebrity;

public class LiteratureCelebrity extends Celebrity
{
	private ArrayList<String> clueList;
	
	LiteratureCelebrity(String name, String clues)
	{
		super(name, clues);
		clueList = new ArrayList<String>();
		for(String clue : clues.split(","))
		{
			clueList.add(clue);
		}
		
	}

}
