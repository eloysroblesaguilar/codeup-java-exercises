import java.util.Scanner;

public class MethodsExcercises {
//    !. Basic Arithmetic
    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply (int num1, int num2) {
        return num1 - num2;
    }

    public static int divide (int num1, int num2) {
        return num1 / num2;

    }

    public static int modulus ( int num1, int num2) {
        return num1 % num2;
    }

////    2.
//    public static int getInteger ( int min, int max) {
//
//    }

    public static void diceRolling () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of sides for the pair of dice");
        Int sides = sc.nextInt();
        do {
            System.out.println("Would you like to commence the rolling?");
            boolean yes = sc.nextBoolean();


        } while (yes);
    }




    public static void main(String[] args) {
        System.out.println(add(2,2));
        System.out.println(subtract(2,2));
        System.out.println(multiply(2,2));
        System.out.println(divide(2,2));
        System.out.println(modulus(2,2));
    }
 }
