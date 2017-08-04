import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void bookHasTitle() throws Exception {
        Book book = new Book("Title");
        String bookTitle = book.getTitle();
        assertEquals("Title", bookTitle);
    }
}