package controller;

import java.util.ArrayList;

import gui.CelebrityFrame;
import model.Celebrity;

public class Controller
{
	private ArrayList<Celebrity> celebrityList;
	private Celebrity currentCelebrity;
	private String currentClue;
	private CelebrityFrame gameFrame;
	
	public void CelebrityController()
	{
		this.celebrityList = new ArrayList<Celebrity>();
	}
	
	public void start()
	{
		 
	}
	
	public void prepareGame()
	{
		celebrityList = new ArrayList<Celebrity>();
		gameFrame.replaceScreen("Start");
	}
	
	public boolean processGuess(String guess)
	{
		boolean matches = false;
		
		if (guess.trim().equalsIgnoreCase(currentCelebrity.getAnswer()))
		{
			matches = true; 
			celebrityList.remove(0);
			if(celebrityList.size() > 0)
			{
				currentCelebrity = celebrityList.get(0);
			}
		}
		
		return matches;
	}
	
	public void playgame()
	{
		
	}
	
	public void reset()
	{
		
	}

	public void addCelebrity(String name, String clue, String type)
	{
		Celebrity toBeAdded = new Celebrity(name, clue);
		celebrityList.add(toBeAdded);
	}
	
	public String checkGuess(String guess)
	{
		String response = "";
		
		if(guess.equalsIgnoreCase(currentCelebrity.getName()))
		{
			response = "Sweet you rock\n";
			if (celebrityList.size() != 0)
			{
				response += getRandomCelebrity().getClue();
			}
			else
			{
				response += "Game over you win";
			}
		}
		else 
		{
			response = "Incorrect! try again\n" + currentCelebrity.getClue();
		}
		return response;
	}
	
	public Celebrity getRandomCelebrity()
	{
		int randomIndex = (int)(Math.random() * celebrityList.size());
		currentCelebrity = celebrityList.remove(randomIndex);
		
		return currentCelebrity;
	}
	
	public boolean validateClue(String clue, String type)
	{
		boolean validClue = false;
		
		if (clue.trim().length() >= 10)
		{
			validClue = true;
			
			if(type.equalsIgnoreCase("lierature"))
			{
				String[] temp = clue.split(",");
				if ( temp.length > 1)
				{
					validClue = true;
				}
				else
				{
					validClue = false;
				}
			}
		}
		return validClue;
	}
	
	public boolean validateCelebrity(String name)
	{
		return false;
	}
	
	public int getCelebrityGameSize()
	{
		return 0;
		
	}
	
	public String getClue()
	{
		if(clueList.sie() >0)
		{
			return clueList.remove(0);
		}
		else
		{
			return "No More Clues";
		}
	}
}
	
	
	

