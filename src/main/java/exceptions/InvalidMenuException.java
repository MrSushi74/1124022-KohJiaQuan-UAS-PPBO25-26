package exceptions;

public class InvalidMenuException extends RuntimeException {
    public InvalidMenuException(String message) {
        super(message);
    }
}
