public class CalcException extends Exception{

    public CalcException(String message) {
        super("ERROR: " + message);
    }
}
