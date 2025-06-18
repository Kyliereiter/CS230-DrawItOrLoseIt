package com.gamingroom;

/**
 * Application driver to test the game service
 */
public class ProgramDriver {

    public static void main(String[] args) {

        // Use Singleton pattern to get the GameService instance
        GameService service = GameService.getInstance();

        // Add some games
        System.out.println("Adding games...");
        Game game1 = service.addGame("Draw It or Lose It");
        Game game2 = service.addGame("Trivia Master");
        Game game3 = service.addGame("Puzzle Rush");

        // Display the total number of games
        System.out.println("\nTotal games: " + service.getGameCount());

        // Use Iterator pattern to loop through all games
        System.out.println("\nListing all games (using Iterator pattern):");
        for (Game game : service) {
            System.out.println("ID: " + game.getId() + ", Name: " + game.getName());
        }

        // Try adding a duplicate game to test reuse
        System.out.println("\nAttempting to add duplicate game: 'Draw It or Lose It'");
        Game duplicateGame = service.addGame("Draw It or Lose It");
        System.out.println("Returned game: ID = " + duplicateGame.getId() + ", Name = " + duplicateGame.getName());

        // Done
        System.out.println("\nProgram completed.");
    }
}
