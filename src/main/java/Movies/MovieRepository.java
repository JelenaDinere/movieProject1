package Movies;

import DataBase.DBHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieRepository {
    DBHandler dbHandler =new DBHandler();

    public void createTable () throws SQLException {

        String query = "CREATE TABLE movies1 (id int primary key auto_increment,"+
                "title VARCHAR(255) NOT NULL,"+
                "genre VARCHAR(255) NOT NULL,"+
                "year_of_release INT NOT NULL)";
        PreparedStatement preparedStatement  = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.execute();
        preparedStatement.close();
    }

    public void deleteTable() throws SQLException{
        String query = "DROP TABLE movies1";

        PreparedStatement preparedStatement  = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.execute();
        preparedStatement.close();

    }

    public void create(Movie movie)throws SQLException {
        String query = "INSERT INTO movies1(title,genre,year_of_release) VALUES(?,?,?)";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setString(1, movie.title);
        preparedStatement.setString(2,movie.genre);
        preparedStatement.setInt(3,movie.year_of_release);

        preparedStatement.execute();
        preparedStatement.close();
    }
    public Movie findMovieById(int id)throws SQLException{
        String query = "SELECT * FROM movies1 WHERE id = " + id;
        Statement statement = dbHandler.getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);

        if(result.next()){
            int movie_id = result.getInt("id");
            String movie_title = result.getString("title");
            String movie_genre = result.getString("genre");
            int year_of_release = result.getInt("year_of_release");

            Movie movie = new Movie(movie_title,movie_genre,year_of_release);
            movie.id=movie_id;
            statement.close();
            return movie;
        } else{
            return null;
        }
    }

    public void delete(int id) throws SQLException{
        String query = "DELETE FROM movies1 WHERE id = ?";

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
        preparedStatement.close();
    }

}
