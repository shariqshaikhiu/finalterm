public class Main {
    public static void main(String[] args) {
        // Try to access the Singleton instance
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        configManager1.setConfig("Theme", "Dark");

        // Try to access the instance again
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        String theme = configManager2.getConfig("Theme");

        // Both references should point to the same instance
        System.out.println("Are both instances the same? " + (configManager1 == configManager2));
    }
}
