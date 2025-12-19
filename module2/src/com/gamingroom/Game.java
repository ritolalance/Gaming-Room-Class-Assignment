package com.gamingroom;
import java.util.List;
import java.util.Iterator;
/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	long id;
	String name;
	private List<Team> teams;
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */


	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public Team addTeam(String name)
	{
		
		Team newTeam = null;

		//iterating over game list to find matching name
		Iterator<Team> teamIterator = teams.iterator();

		while(teamIterator.hasNext())
		{
			Team nextTeam = teamIterator.next();
			if (nextTeam.equals(name))
			{
				newTeam = nextTeam;
			}
		}

		return newTeam;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
