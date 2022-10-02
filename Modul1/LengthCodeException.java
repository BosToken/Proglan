public class LengthCodeException extends Exception{
    public LengthCodeException(String message){
        super(message);
    }

    public LengthCodeException(){
        super("The length of your code must match");
    }
}
