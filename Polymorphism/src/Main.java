import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Adventure", "Mission Impossible");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter A for Adventure, C for Comedy, s for Science Fiction , Q for quit.");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }
    }
}