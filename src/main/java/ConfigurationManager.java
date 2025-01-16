public class ConfigurationManager {

    // Step 2: Declare a private static instance of the class
    private static ConfigurationManager instance;

    // Step 3: Create a private constructor to restrict instantiation
    private ConfigurationManager() {
        // Initialize configuration settings here
        System.out.println("Configuration Manager initialized.");
    }

    // Step 4: Provide a public static method to get the single instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            // Step 5: Lazy initialization - create the instance only when needed
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Step 6: Add methods to manage configuration
    public void setConfig(String key, String value) {
        // Set configuration key-value pair
        System.out.println("Setting configuration: " + key + " = " + value);
    }

    public String getConfig(String key) {
        // Fetch configuration value for the given key
        System.out.println("Fetching configuration for key: " + key);
        return "ExampleValue"; // Replace with actual implementation
    }
}
