package exceptions;

/**
 * @author mingtu
 * @create 2022-01-17 21:07
 */
public class SellException extends RuntimeException {
    public SellException(String message) {
        super(message);
    }
}
