import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicNumber = (int) (1 + Math.random() * 100);
        int userGuess;

        System.out.println("Hello! Welcome to the Guessing Game!");

        do {

            System.out.println(" ");
            System.out.println("Gimme a guess!");
            userGuess = sc.nextInt();

            if (userGuess > magicNumber) {
                System.out.println("LOWER!");
            } else if (userGuess < magicNumber) {
                System.out.println("HIGHER!");
            } else if (userGuess == magicNumber) {
                System.out.println("GOOD GUESS!");
            }

        } while (userGuess != magicNumber);
    }
}
