import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class MenuTest {

    PrintStream printStream;
    BufferedReader reader;
    Biblioteca biblioteca;
    Menu menu;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        biblioteca = new Biblioteca(printStream, reader);
        menu = new Menu(printStream, reader);
    }

    @Test
    public void shouldShowMenuOptions() {
        biblioteca.listMenuOptions();
        verify(printStream).println("1) List books");
    }

    @Test
    public void shouldReturnIncorrectOptionResult() throws Exception {
        when(reader.readLine()).thenReturn("wrong");
        String userInput = menu.getUserInput();
        assertEquals("0", userInput);
    }



    @Test
    public void shouldVerifyUserInput() throws IOException {
        Menu menu = new Menu(printStream, reader);
        when(reader.readLine()).thenReturn("1");
        String userInput = menu.getUserInput();
        assertEquals("1",userInput);
    }


}