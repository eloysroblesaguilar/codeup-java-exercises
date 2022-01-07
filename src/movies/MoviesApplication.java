package movies;

import util.Input;

public class MoviesApplication {


    public static void movieFetch() {
        Input in = new Input();
        System.out.println("What would you like to do?");

        System.out.println("0 - exit\n1 - view all movies\n 2 -view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category");
        System.out.printf("Enter your choice : ");
       int userResponse = in.getInt();

       switch (userResponse){
           case 0:
               return;
           case 1:
               MoviesArray.findAll();
               break;
           case 2:
               break;
           case 3:
               break;
           case 4:
               break;
           case 5:
               break;
       }

    }

    public static void main(String[] args) {



    }
}
