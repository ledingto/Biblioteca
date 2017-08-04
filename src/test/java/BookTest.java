import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void bookHasTitle() throws Exception {
        Book book = new Book("Title", 0, "John Doe");
        String bookTitle = book.toString();
        assertEquals("Title", bookTitle);
    }


}