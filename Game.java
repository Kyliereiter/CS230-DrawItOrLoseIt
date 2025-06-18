package com.gamingroom;

/**
 * A simple class to hold game information
 */
public class Game {

    private long id;        // Unique game ID
    private String name;    // Game name

    /**
     * Constructor with ID and name
     * 
     * @param id    the unique ID of the game
     * @param name  the name of the game
     */
    public Game(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the ID of the game
     * 
     * @return the ID
     */
    public long getId() {
        return id;
    }

    /**
     * Get the name of the game
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * String representation of the game object
     */
    @Override
    public String toString() {
        return "Game [id=" + id + ", name=" + name + "]";
    }
}
