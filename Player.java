package com.gamingroom;

/**
 * A class to hold information about a player.
 * Inherits id and name from the Entity class.
 */
public class Player extends Entity {

    /**
     * Constructor with an identifier and name.
     * 
     * @param id the unique identifier
     * @param name the name of the player
     */
    public Player(long id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
