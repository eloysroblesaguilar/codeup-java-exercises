public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("World!");

        int myFavoriteNumber = 9;
        System.out.print(myFavoriteNumber);

        String myString = "Covfefe";

        // If I try to assign a character value to myString I get an error,
        // because it is expecting a one character string within single quotations


        // If I assign the value 3.14159 value to myString I also get an error,
        // because Intellij is expecting me to give it a string

        float myNumber = 3.14f;

        System.out.print(myNumber);

        // The variable myNumber with no value has yet to be initialized,
        // so Intellij gives me an error if I try to print it without assigning it a value

        // BYTE SHORT INT AND LONG ARE INTEGRAL NUMBER DATA TYPES MEANING THEY HANDLE INTEGERS,
        // DOUBLE AND FLOAT ALLOWS FOR DECIMAL POINT VALUES

        // If I try to assign the value of 3.14 to the float variable of myNumber,
        // I get an error bc in Java when you type a decimal number it will be interpreted as a
        // double unless you end the number with an f to indicate that you are assigning a float value

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // int x = 5;
        // System.out.println(++x);
        // System.out.println(x);

        // int class = 9;
        // class test {}

        // I cannot create a variable class and the class keyword does not want to be
        // assigned a value like a variable

//         String theNumberThree = "three";
//         Object o = theNumberThree;
//         int three = (int) o;

        // The first error that is observed is a casting error.
        // Although you can assign an object any value,
        // you cannot cast a String class into an Integer class

        // int three = (int) "three";

        // This error shows up in the IDE before running because it is understood that the string and integer types are incompatible ,
        // something that was not apparent when working with an object not a string literal
        // System.out.print(three);

//        int x = 4;
//        x +=  5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        int x = Integer.MAX_VALUE;

//        2147483647
//        ++x;
//        -2147483648

        System.out.println(x);
    //Whenever I increment past the capacity of the integer types capacity
    // I see the value increment but as a negative value.

    }


}

