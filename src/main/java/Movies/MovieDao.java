package Movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDao {
    MovieRepository movieRepository = new MovieRepository();

    public String createTable() {
        try {
            movieRepository.createTable();
            return "Table created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating table!";

        }

    }
    public  String deleteTable() {

        try {
            movieRepository.deleteTable();
            return "Table deleted successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error deleting table!";

        }

    }
    public String createMovie(Movie movie) {
        try {
            movieRepository.create(movie);
            return "Movie created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating movie";
        }
    }
    public Movie findProduct(int id) {
        try {
            return movieRepository.findMovieById(id);
        } catch (SQLException e) {
            System.out.println("Can not find movie with id:" + id);
            e.printStackTrace();
            return null;
        }
    }
    public void deleteMovie (int id){
        try{
            movieRepository.delete(id);
            System.out.println("Movie deleted successfully");
        }catch(SQLException e){
            System.out.println(e);
        }
    }

}
