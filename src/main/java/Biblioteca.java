public class Biblioteca {

    static BibliotecaPrinter printer;

    public Biblioteca() {
    }

    public static void main() {
        printer = new BibliotecaPrinter(System.out);
        printer.printWelcomeCustomer();
    }
}
