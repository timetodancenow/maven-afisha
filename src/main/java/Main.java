import ru.netology.manager.Manager;
import ru.netology.domain.MoviePoster;

public class Main {


    public static void main ( String[] args ) {


        MoviePoster first = new MoviePoster ( "Hotel1" );
        MoviePoster second = new MoviePoster ( "Hotel2" );
        MoviePoster third = new MoviePoster ( "Hotel3" );
        MoviePoster fourth = new MoviePoster ( "Hotel4" );
        MoviePoster fifth = new MoviePoster ( "Hotel5" );
        MoviePoster sixth = new MoviePoster ( "Hotel6" );
        MoviePoster seventh = new MoviePoster ( "Hotel7" );
        MoviePoster eighth = new MoviePoster ( "Hotel8" );
        MoviePoster ninth = new MoviePoster ( "Hotel9" );
        MoviePoster tenth = new MoviePoster ( "Hotel10" );

        Manager manager = new Manager ();
        manager.add ( first );
        manager.add ( second );
        manager.add ( third );
        manager.add ( fourth );
        manager.add ( fifth );
        manager.add ( sixth );
        manager.add ( seventh );
        manager.add ( eighth );
        manager.add ( ninth );
        manager.add ( tenth );

        manager.findAll ();

        manager.findLast ();
    }

}