package com.gamingroom;

/**
 * A simple class to test the Singleton behavior
 */
public class SingletonTester {

    public void testSingleton() {
        GameService service = GameService.getInstance();

        System.out.println("\nSingleton test:");
        System.out.println("Game count: " + service.getGameCount());
    }
}