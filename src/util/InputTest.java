package util;

import java.util.Scanner;

public class InputTest {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
        String userString = sc.nextLine();
        return userString;
    }

    public String getString(String userPrompt) {
        System.out.println(userPrompt);
        String userString = sc.nextLine();
        return userString;
    }

    public boolean yesNo() {
        String userBoolean = sc.nextLine();
        if (userBoolean.equalsIgnoreCase("yes") || userBoolean.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String userPrompt) {
        System.out.println(userPrompt);
        String userBoolean = sc.nextLine();
        if (userBoolean.equalsIgnoreCase("yes") || userBoolean.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = sc.nextInt();

        if (max >= userInt && userInt >= min) {
            return userInt;
        } else {
            System.out.printf("Please make sure the integer you entered is between %d and %d.%n", min, max);
            getInt(min, max);
        }
        return 0;
    }

    public int getInt(int min, int max, String userPrompt) {
        System.out.println(userPrompt);
        int userInt = sc.nextInt();

        if (max >= userInt && userInt >= min) {
            return userInt;
        } else {
            System.out.printf("Please make sure the integer you entered is between %d and %d.%n", min, max);
            getInt(min, max);
        }
        return 0;
    }

    public int getInt() {
        int userInt = sc.nextInt();
        return userInt;
    }

    public int getInt(String userPrompt) {
        System.out.println(userPrompt);
        int userInt = sc.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max) {
        double userDbl = sc.nextDouble();

        if (max >= userDbl && userDbl >= min) {
            return userDbl;
        } else {
            System.out.printf("Please make sure the double you entered is between %d and %d.%n", min, max);
            getDouble(min, max);
        }
        return 0;
    }

    public double getDouble(double min, double max, String userPrompt) {
        System.out.println(userPrompt);
        double userDbl = sc.nextDouble();

        if (max >= userDbl && userDbl >= min) {
            return userDbl;
        } else {
            System.out.printf("Please make sure the double you entered is between %d and %d.%n", min, max);
            getDouble(min, max);
        }
        return 0;
    }

    public double getDouble() {
        double userDbl = sc.nextDouble();
        return userDbl;
    }

    public double getDouble(String userPrompt) {
        System.out.println(userPrompt);
        double userDbl = sc.nextDouble();
        return userDbl;
    }


}


