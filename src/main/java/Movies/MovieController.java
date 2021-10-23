package Movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieController {
    MovieDAOImpl movieDAO = new MovieDAOImpl();

    public String createTable() {
        try {
            movieDAO.createTable();
            return "Table created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating table!";

        }

    }
    public  String deleteTable() {

        try {
            movieDAO.deleteTable();
            return "Table deleted successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error deleting table!";

        }

    }
    public String createMovie(Movie movie) {
        try {
            movieDAO.create(movie);
            return "Movie created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating movie";
        }
    }
    public Movie findMovie(int id) {
        try {
            return movieDAO.findMovieById(id);
        } catch (SQLException e) {
            System.out.println("Can not find movie with id:" + id);
            e.printStackTrace();
            return null;
        }
    }
    public void deleteMovie (int id){
        try{
            movieDAO.delete(id);
            System.out.println("Movie deleted successfully");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public ArrayList<Movie> getAllMovies(){
        try {
            return movieDAO.getAll();
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public void updateMovie(Movie movie){
        try {
            movieDAO.updateTitle(movie);
            System.out.println("Movie title updated successfully");
        }catch (SQLException e){
            System.out.println(e);
        }
    }

}
