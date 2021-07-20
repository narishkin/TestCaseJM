public class CalcException extends Exception{

    public CalcException() {
    }

    public CalcException(String message) {
        super("ERROR: " + message);
    }
}
