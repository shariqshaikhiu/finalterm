package com.finalterm.exam.singleton;

/**
 * The Singleton class demonstrates the Singleton design pattern.
 * This pattern restricts the instantiation of a class to one single instance
 * and provides a global point of access to that instance.
 */
public class Singleton {
    /** The single instance of this class */
    private static Singleton instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * This ensures that the Singleton instance can only be created within this class.
     */
    private Singleton() {
        // Exists only to defeat instantiation.
    }

    /**
     * Gets the single instance of the Singleton class.
     * If the instance doesn't exist, it creates one.
     *
     * @return The single instance of Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}