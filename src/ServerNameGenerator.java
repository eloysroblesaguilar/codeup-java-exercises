public class ServerNameGenerator {




public static String getString (String [] array) {
    int magicNumber = (int) (1 + Math.random() * array.length);
    System.out.println(array[magicNumber]);
    return array[magicNumber];
}

    public static void main(String[] args) {
        String[] nouns = {"neanderthal", "human", "chimpanzee", "bonobo", "gorilla", "orangutan", "lemur", "baboon", "simian", "monkey", "primate"};
        String[] adjectives = {"adorable", "agreeable", "amused", "ashamed", "bewildered", "arrogant", "brainy", "blue-eyed", "breakable", "alert", "aggressive"};



        System.out.printf("Here is your server name:\n%s-%s", getString(adjectives), getString(nouns));

    }
}
