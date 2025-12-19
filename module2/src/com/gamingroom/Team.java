package com.gamingroom;
import java.util.List;
import java.util.Iterator;
/**
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{

	private List<Player> players;
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player addPlayer(String name)
	{
		Player newPlayer = null;

		//iterating over game list to find matching name
		Iterator<Player> playerIterator = players.iterator();

		while(playerIterator.hasNext())
		{
			Player nextPlayer = playerIterator.next();
			if (nextPlayer.equals(name))
			{
				newPlayer = nextPlayer;
			}
		}

		return newPlayer;
	}

	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}
