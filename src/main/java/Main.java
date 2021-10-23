import Movies.Movie;
import Movies.MovieController;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        Scanner scanner = new Scanner(System.in);

//      //  Create table
//        System.out.println(movieController.createTable());
//
//      //  Delete table
//        System.out.println(movieController.deleteTable());
//
//       // Create recordings in the movies table
//        System.out.println(movieController.createMovie(new Movie("Titanic","Drama",2000)));
//        System.out.println(movieController.createMovie(new Movie("Pulp Fiction","Drama",1994)));
//        System.out.println(movieController.createMovie(new Movie("No time to die","Adventure",2021)));
//
//       // Delete Movie recording by id
//       // Scanner scanner = new Scanner(System.in);
//     //   System.out.println( "Enter the id of movie" );
//      //  int id = scanner.nextInt();
//     //   movieController.deleteMovie(id);
//
//      //  Get all movies
//        System.out.println(movieController.getAllMovies() );

        System.out.println("Enter movies id");
        int id = scanner.nextInt();
        Movie movie = movieController.findMovie(id);
        movie.title = "No time to die";
        movieController.updateMovie(movie);

    }
}
