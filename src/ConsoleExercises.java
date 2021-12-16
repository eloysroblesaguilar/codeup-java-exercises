import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately: %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Please enter an integer");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
        // If you enter something that is not an integer you get an InputMismatchException error
        System.out.println("Please enter 3 words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("%s%n%s%n%s%n", firstWord,secondWord,thirdWord);
        //Nothing happens if i enter more than three words
        //If i only enter two words and hit return it does not let me continue
        // until i enter all three words
        System.out.println("Please enter a sentence");
        String userSentence = scanner.next();
        System.out.printf("Your sentence is : %s%n", userSentence);

        System.out.println("Please enter the length of your room in feet");
        int length = scanner.nextInt();
        System.out.println("Please enter the width of your room in feet");
        int width = scanner.nextInt();
        float area = length * width;
        System.out.println(area);
        float perimeter = (length * 2) + (width * 2);

        System.out.printf("The area of your room is : %.1f %nThe perimeter of your room is: %.1f %n", area,perimeter);

    }
}
