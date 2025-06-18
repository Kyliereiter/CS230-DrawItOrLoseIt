package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine.
 * Manages games using Singleton and Iterator patterns.
 */
public class GameService implements Iterable<Game> {

    // List of active games
    private static List<Game> games = new ArrayList<Game>();

    // Tracks the next game ID
    private static long nextGameId = 1;

    // Singleton instance
    private static GameService instance = null;

    // Private constructor
    private GameService() {
    }

    /**
     * Singleton accessor
     * 
     * @return the one and only GameService instance
     */
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Add a game by name, or return existing if already exists
     * 
     * @param name the name of the game
     * @return new or existing game
     */
    public Game addGame(String name) {
        Game game = null;

        // Look for existing game by name (Iterator pattern)
        for (Game existingGame : games) {
            if (existingGame.getName().equalsIgnoreCase(name)) {
                game = existingGame;
                break;
            }
        }

        // If not found, create and add new game
        if (game == null) {
            game = new Game(nextGameId++, name);
            games.add(game);
        }

        return game;
    }

    /**
     * Get total number of games
     * 
     * @return count of games
     */
    public int getGameCount() {
        return games.size();
    }

    /**
     * Get a game by index
     * 
     * @param index position
     * @return game at that index
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Get a game by ID
     * 
     * @param id the game's ID
     * @return matching game or null
     */
    public Game getGame(long id) {
        for (Game game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    /**
     * Get a game by name
     * 
     * @param name the game's name
     * @return matching game or null
     */
    public Game getGame(String name) {
        for (Game game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                return game;
            }
        }
        return null;
    }

    @Override
    public java.util.Iterator<Game> iterator() {
        return games.iterator();
    }
}
