package controller;

import java.util.ArrayList;

import model.Celebrity;

public class Controller
{
	private ArrayList<Celebrity> celebrityList;
	private Celebrity currentCelebrity;
	
	public void CelebrityController()
	{
		super();
	}
	
	public void start()
	{
		 
	}
	
	public void addCelebrity(String name, String clue, String type)
	{
		Celebrity toBeAdded = new Celebrity(name, clue);
		celebrityList.add(toBeAdded);
	}
}
