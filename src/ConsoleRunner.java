import java.util.Scanner;

public class ConsoleRunner {
    static final String KEY_STOP_APP = "end";

    public static void main(String[] args) {
        Printer printer = new Printer();
        Parser parser = new Parser();
        Scanner sc = new Scanner(System.in);
        String line;
        for (; ; ) {
            line = sc.nextLine();
            if (!line.equals(KEY_STOP_APP)) {
                try {
                    Var result = parser.calc(line);
                    printer.print(result);
                } catch (CalcException e) {
                    printer.print(e);
                    break;
                }
            } else {
                break;
            }
        }
    }
}
