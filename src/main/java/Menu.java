import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {

    ArrayList<String> options;
    PrintStream printStream;

    public Menu(PrintStream printStream) {
        options = new ArrayList<String>(1);
        options.add("List books");
        this.printStream = printStream;
    }

    public void printOptions() {
        for (String option: options) {
            int optionNumber = options.indexOf(option)+1;
            printStream.println(optionNumber + ") " + option);
        }
    }
}
