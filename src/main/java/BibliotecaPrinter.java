import java.io.PrintStream;

public class BibliotecaPrinter {


    private PrintStream printStream;

    public BibliotecaPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printWelcomeCustomer() {
        printStream.println("Welcome to the Biblioteca!");
    }
}
