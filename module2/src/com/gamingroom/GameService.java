package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	

	// GameService is meant to be a singleton class. This means by design, there will only be one instance of this class. 
	// Making the constructor private makes it impossible to create another instance outside the class.

	public static GameService gameServiceInstance;

	private GameService()
	{
		
	}

	//This method creates the Game Service if one does not exist.
	// Static makes the variable or function to be called anywhere and always stays the same between all class instances
	// Static variable gameServiceInstance will be used to check if there exists a GameService instance.
	public static GameService CreateGameService()
	{
		if (gameServiceInstance == null)
		{
			gameServiceInstance = new GameService();
			System.out.println("Game Service is created");
			return gameServiceInstance;
		}
		else
		{
			System.out.println("Game Service is already open");
			return null;
		}
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		//checking for existing game instance
		game = getGame(name);

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		//iterating over game list to find matching name
		Iterator<Game> gameIterator = games.iterator();

		while(gameIterator.hasNext())
		{
			Game nextGame = gameIterator.next();
			if (nextGame.equals(name))
			{
				game = nextGame;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
