package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to hold information about a team.
 * Inherits id and name from the Entity class.
 */
public class Team extends Entity {

    // A list to store players on this team
    private List<Player> players = new ArrayList<Player>();

    /**
     * Constructor with an identifier and name
     * 
     * @param id the unique identifier of the team
     * @param name the name of the team
     */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a player to the team, checking for duplicates by name
     * 
     * @param id the unique id of the player
     * @param name the name of the player
     * @return the new or existing player object
     */
    public Player addPlayer(long id, String name) {
        Player player = null;

        // Check if player already exists
        for (Player existingPlayer : players) {
            if (existingPlayer.getName().equalsIgnoreCase(name)) {
                player = existingPlayer;
                break;
            }
        }

        // If not found, add new player
        if (player == null) {
            player = new Player(id, name);
            players.add(player);
        }

        return player;
    }

    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}

