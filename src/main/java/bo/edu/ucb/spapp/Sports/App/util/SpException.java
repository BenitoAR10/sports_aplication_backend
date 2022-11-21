package bo.edu.ucb.spapp.Sports.App.util;

public class SpException extends RuntimeException{
    public SpException(String message) {
        super(message);
    }

    public SpException(String message, Throwable cause) {
        super(message, cause);
    }
}
