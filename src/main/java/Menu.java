import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {

    ArrayList<String> options;
    PrintStream printStream;
    private BufferedReader reader;

    public Menu(PrintStream printStream, BufferedReader reader) {
        options = new ArrayList<String>(1);
        options.add("List books");
        this.printStream = printStream;
        this.reader = reader;
    }

    public void printOptions() {
        for (String option: options) {
            int optionNumber = options.indexOf(option)+1;
            printStream.println(optionNumber + ") " + option);
        }
    }

    public String getUserInput() {
        printStream.println("Please enter the option number:");
        try {
            String userInput = reader.readLine();

            if (userInput.equals("1")) {
                return userInput;
            } else {
                return "0";
            }
        } catch (IOException e) {
            return "0";
        }
    }

}
