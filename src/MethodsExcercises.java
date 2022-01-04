import java.util.Scanner;

public class MethodsExcercises {
    //    !. Basic Arithmetic
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 - num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;

    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //    2.
    public static void getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        Boolean yes;

        System.out.printf("Please enter in an integer between %d and %d %n", min, max);
        int userInt = scan.nextInt();
        if (max >= userInt && userInt >= min) {
            System.out.printf("%d is a valid answer, Thank You!%n", userInt);
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                getInteger(min, max);
            }
        } else {
            System.out.printf("%d is not a valid answer!%n", userInt);
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                getInteger(min, max);
            }
        }

    }

    //3.
    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        Boolean yes;
        long userFactorial = 1;

        System.out.println("Please enter in an integer between 1 and 10");
        int userInt = scan.nextInt();

        if (10 >= userInt && userInt >= 1) {
            System.out.printf("%d is a valid answer, Thank You!%n", userInt);

            for (int i = 1; i <= userInt; i++) {
                userFactorial *= i;
            }
            System.out.println("...");
            System.out.printf("%d! = %d%n", userInt, userFactorial);


            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                factorial();
            }
        } else {
            System.out.printf("%.0f is not a valid answer!%n", userInt);
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                factorial();
            }
        }


    }




//
//    public static void diceRolling() {
//        Scanner sc = new Scanner(System.in);
//        Boolean rollTheDice;
//
//        System.out.println("Hello!");
//        System.out.println("Please enter the number of sides for the pair of dice");
//        float sides = sc.nextInt();
//        System.out.printf("Your dice will have %.0f sides!%n", sides);
//
//        System.out.println("Would you like to commence the rolling?");
//        rollTheDice = sc.nextBoolean();
//
//
//    }


    public static void main(String[] args) {
        factorial();

    }
}
