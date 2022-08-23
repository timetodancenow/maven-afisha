import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;
import ru.netology.manager.Manager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    Manager manager = new Manager ( 5 );
    private final MoviePoster first = new MoviePoster ( "Hotel1" );
    private final MoviePoster second = new MoviePoster ( "Hotel2" );
    private final MoviePoster third = new MoviePoster ( "Hotel3" );
    private final MoviePoster fourth = new MoviePoster ( "Hotel4" );
    private final MoviePoster fifth = new MoviePoster ( "Hotel5" );
    private final MoviePoster sixth = new MoviePoster ( "Hotel6" );
    private final MoviePoster seventh = new MoviePoster ( "Hotel7" );
    private final MoviePoster eighth = new MoviePoster ( "Hotel8" );
    private final MoviePoster ninth = new MoviePoster ( "Hotel9" );
    private final MoviePoster tenth = new MoviePoster ( "Hotel10" );

    @Test
    void ShouldAddSomeFilms () {
        manager.findAll ();
        manager.add ( first );
        manager.add ( fifth );
        manager.add ( eighth );
        MoviePoster[] expected = {first, fifth, eighth};
        MoviePoster[] actual = manager.findAll ();
        assertArrayEquals ( expected, actual );
    }

    @Test
    void ShouldShow5LastAddedFilms () {
        manager.findAll ();
        manager.add ( second );
        manager.add ( fourth );
        manager.add ( seventh );
        manager.add ( eighth );
        manager.add ( tenth );
        MoviePoster[] expected = {tenth, eighth, seventh, fourth, second};
        MoviePoster[] actual = manager.findLast ();
        assertArrayEquals ( expected, actual );
    }

    @Test
    void ShouldShowLastAddedFilms () {
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
        MoviePoster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MoviePoster[] actual = manager.findLast ();
        assertArrayEquals ( expected, actual );
    }

    @Test
    void ShouldAllAddedFilms () {
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
        MoviePoster[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        MoviePoster[] actual = manager.findAll ();
        assertArrayEquals ( expected, actual );
    }

}