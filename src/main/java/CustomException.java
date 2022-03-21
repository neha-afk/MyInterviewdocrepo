public class CustomException extends RuntimeException {
    CustomException(String message){
        super(message);

    }
    CustomException(String message, Throwable cause){
        super(message,cause);
    }
}
