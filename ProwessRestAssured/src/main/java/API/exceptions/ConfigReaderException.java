package API.exceptions;

public class ConfigReaderException extends RuntimeException {
    public ConfigReaderException(String message) {
        super(message);
    }
    public ConfigReaderException(String message, Throwable cause) {

    }
}
