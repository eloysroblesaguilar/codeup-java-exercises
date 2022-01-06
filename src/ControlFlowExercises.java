import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1a.
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(" " + i);
//        }

//1b.
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);

//2.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Enter in a number!");
        float userNum = sc.nextInt();

        System.out.printf("%-7s| %-7s | %-7s%n", "number", "squared", "cubed");
        System.out.println("--------------------------");
//3.
        for ( float i = 1; i <= userNum; i++) {
            System.out.printf("%-7.0f| %-7.0f | %-10.0f %n", i, (i * i ), (i * i * i));
        }

//4.
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//
        Boolean yes;
        do {
            System.out.println("Enter in your numerical grade");
            int userGrade = sc.nextInt();
            if ( 100 >= userGrade & userGrade >= 88) {
                System.out.println("Your letter grade is an A.");
            } else if (87 >= userGrade & userGrade >= 80) {
                System.out.println("Your letter grade is a B.");
            } else if (79 >= userGrade &  userGrade >= 67) {
                System.out.println("Your letter grade is a C.");
            } else if (66 >= userGrade & userGrade >= 60) {
                System.out.println("Your letter grade is a D.");
            } else if (59 >= userGrade) {
                System.out.println("Your letter grade is an F.");
            }
            System.out.println("WOULD YOU LIKE TO CONTNIUE? \nTRUE FOR YES |  FALSE FOR NO ");
            yes = sc.nextBoolean();
        } while (yes);




    }
}
