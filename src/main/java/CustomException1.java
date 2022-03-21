public class CustomException1 extends RuntimeException {
    CustomException1(String message){
        super(message);

    }
    CustomException1(String message, Throwable cause){
        super(message,cause);
    }

}
