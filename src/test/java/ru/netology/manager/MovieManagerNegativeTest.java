package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCatalog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerNegativeTest {

    MovieManager manager10 = new MovieManager();
    MovieManager manager = new MovieManager(5);

    private final MovieCatalog first = new MovieCatalog(
            1, 1, "Movie1", "action");
    private final MovieCatalog second = new MovieCatalog(
            2, 2, "Movie2", "action");
    private final MovieCatalog third = new MovieCatalog(
            3, 3, "Movie3", "action");


    @Test
    public void shouldGetAllFromManager() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        MovieCatalog[] actual = manager.getItems();
        MovieCatalog[] expected = {
                third,
                second,
                first
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllFromManager10() {
        manager10.addMovie(first);
        manager10.addMovie(second);
        manager10.addMovie(third);
        MovieCatalog[] actual = manager10.getItems();
        MovieCatalog[] expected = {
                third,
                second,
                first
        };
        assertArrayEquals(expected, actual);
    }
}
