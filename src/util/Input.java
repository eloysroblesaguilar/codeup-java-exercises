package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public String getString() {
        return sc.nextLine();
    }

    public String getString(String userPrompt) {
        System.out.println(userPrompt);
        return sc.nextLine();
    }

    public boolean yesNo() {
        String userBoolean = sc.next();
        if (userBoolean.equalsIgnoreCase("yes") || userBoolean.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String userPrompt) {
        System.out.println(userPrompt);
        String userBoolean = sc.next();
        if (userBoolean.equalsIgnoreCase("yes") || userBoolean.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public  int getInt(int min, int max) {
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
        return sc.nextInt();
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
            return 0;
        }
    }

    public double getDouble(double min, double max, String userPrompt) {
        System.out.println(userPrompt);
        double userDbl = sc.nextDouble();

        if (max >= userDbl && userDbl >= min) {
            return userDbl;
        } else {
            System.out.printf("Please make sure the double you entered is between %d and %d.%n", min, max);
            getDouble(min, max);
            return 0;
        }
    }

    public double getDouble() {
        return sc.nextDouble();
    }

    public double getDouble(String userPrompt) {
        System.out.println(userPrompt);
        return sc.nextDouble();
    }


}

