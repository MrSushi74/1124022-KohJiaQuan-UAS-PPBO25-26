package exceptions;

public class InvalidOSException extends RuntimeException {
    public InvalidOSException() {
        super("Salah Pilih Operating System : ");
    }
}
