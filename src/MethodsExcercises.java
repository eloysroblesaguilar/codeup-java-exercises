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
    public static void getInteger(float min, float max) {
        Scanner scan = new Scanner(System.in);
        Boolean yes;

        System.out.printf("Please enter in an integer between %.0f and %.0f %n", min, max);
        float userInt = scan.nextInt();
        if (max >= userInt && userInt >= min) {
            System.out.printf("%.0f is a valid answer, Thank You!%n", userInt);
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                getInteger(min, max);
            }
        } else {
            System.out.printf("%.0f is not a valid answer!%n", userInt);
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = scan.nextBoolean();
            if (yes == true) {
                getInteger(min, max);
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
        getInteger(1, 40);

    }
}
