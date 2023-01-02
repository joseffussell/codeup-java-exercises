public class ServerNameGenerator {

    private static String[] adjective = {"adorable", "adventurous", "agreeable", "aggressive", "alert", "alive", "amused", "angry", "annoyed", "anxious"};
    private static String[] nouns = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};
    public static int getRandom() {
        return (int) Math.floor(Math.random() * 9);
    }

    public static void main(String[] args) {
        System.out.println("Here is your new servername: " + adjective[getRandom()] + "-" + nouns[getRandom()]);

    }
}