package _13_loop;

import org.junit.jupiter.api.Test;
import org.mockito.ScopedMock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void twitterHandles() {
        Author jisoo = new Author("ms", null);
        Author hajs = new Author("gmarket", "hajs");
        assertEquals(List.of("hajs"), Author.twitterHandles(List.of(jisoo, hajs), "gmarket"));
    }
}