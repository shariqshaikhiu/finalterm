package com.finalterm.exam.SingletonPattern;


/**
 * A thread-safe Singleton class implementation.
 * This class ensures that only one instance of Singleton is created.
 */
public class Singleton {

    /**
     * The single instance of this class.
     * Volatile keyword is used to ensure that changes to instance are immediately visible to other threads.
     */
    private static volatile Singleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private Singleton() {
        // Private constructor to prevent instantiation
    }

    /**
     * Returns the single instance of Singleton class.
     * This method is thread-safe and uses double-checked locking to reduce the overhead of synchronization.
     *
     * @return The single instance of Singleton class.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}