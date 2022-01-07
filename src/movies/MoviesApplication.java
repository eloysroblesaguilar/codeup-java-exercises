package movies;

import util.Input;

public class MoviesApplication {




    public static void movieFilter(String category) {
       Movie[] movies =  MoviesArray.findAll();
       if (category == "all") {
           for (Movie movie : movies){
               System.out.println(movie);
           }
       } else {
           for (Movie movie : movies) {
               if (movie.getCategory() == category) {
                   System.out.println(movie);
               }
           }
       }
    }

    public static void movieFetch() {
        Input in = new Input();
        System.out.println("What would you like to do?");

        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category");
        System.out.printf("Enter your choice : ");
       int userResponse = in.getInt();

       switch (userResponse){
           case 0:
               return;
           case 1:
               movieFilter("all");
               break;
           case 2:
               movieFilter("animated");
               break;
           case 3:
               movieFilter("drama");
               break;
           case 4:
               movieFilter("horror");
               break;
           case 5:
               movieFilter("scifi");
               break;
       }

       if (in.yesNo("Would you like to view another category?")) {
           movieFetch();
       }

    }

    public static void main(String[] args) {

        movieFetch();


    }
}
