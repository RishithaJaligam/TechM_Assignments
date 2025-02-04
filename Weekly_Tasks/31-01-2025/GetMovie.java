package TechM;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class GetMovie {
	private String movieName;
    private String company;
    private String genre;
    private int budget;
   GetMovie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }
    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}
class Solution_GetMovie {
    public static GetMovie[] getMovieByGenre(GetMovie[] movies, String searchGenre) {
        List<GetMovie> filteredMovies = new ArrayList<>();
        for (GetMovie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies.toArray(new GetMovie[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetMovie[] movies = new GetMovie[4];

        for (int i = 0; i < 4; i++) {
            movies[i] = new GetMovie(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
String searchGenre = sc.next();
        
        GetMovie[] filteredMovies = Solution_GetMovie.getMovieByGenre(movies, searchGenre);
        for (GetMovie movie : filteredMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
        
        sc.close();
    }

}
