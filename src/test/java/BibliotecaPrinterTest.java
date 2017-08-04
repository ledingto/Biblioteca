import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaPrinterTest {
    @Test
    // Welcome Message  - As a customer, I would like to see a welcome message when I start the application,
    // so that I feel welcome and know that Biblioteca is available.
    public void shouldSeeWelcomeMessageWhenApplicationStarted() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        BibliotecaPrinter printer = new BibliotecaPrinter(printStream);
        printer.printWelcomeCustomer();
        verify(printStream).println("Welcome to the Biblioteca!");
    }


}
