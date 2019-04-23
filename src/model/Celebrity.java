package model;

public class Celebrity
{
	private String name;
	private String clue;
	private String answer;

	public Celebrity(String name, String clue)
	{
		this.name = name;
		this.clue = clue;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getClue()
	{
		return clue;
	}
	
	public String getAnswer()
	{
		return answer;
	}
}
