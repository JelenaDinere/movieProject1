import Movies.Movie;
import Movies.MovieDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();
        //Create table
        //System.out.println(movieDao.createTable());

        //Delete table
        //System.out.println(movieDao.deleteTable());

        //Create recordings in the movies table
//        System.out.println(movieDao.createMovie(new Movie("Titanic","Drama",2000)));
//        System.out.println(movieDao.createMovie(new Movie("Pulp Fiction","Drama",1994)));
//        System.out.println(movieDao.createMovie(new Movie("No time to die","Adventure",2021)));

        //Delete Movie recording by id
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the id of movie" );
        int id = scanner.nextInt();
        movieDao.deleteMovie(id);


    }
}
