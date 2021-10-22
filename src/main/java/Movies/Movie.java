package Movies;

public class Movie {
    public int id;
    public String title;
    public String genre ;
    public int year_of_release ;

    public Movie(String title, String genre, int year_of_release) {
        this.title = title;
        this.genre = genre;
        this.year_of_release = year_of_release;
    }

    public  Movie () {

    }

    @Override
    public String toString() {
        return "Movie{" +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", year_of_release=" + year_of_release +
                '}';
    }
}

